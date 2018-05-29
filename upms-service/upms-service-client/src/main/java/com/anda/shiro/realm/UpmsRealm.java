package com.anda.shiro.realm;

import com.anda.pojo.UpmsPermission;
import com.anda.pojo.UpmsRole;
import com.anda.pojo.UpmsUser;
import com.anda.service.UpmsApiService;
import com.anda.util.MD5Util;
import com.anda.util.PropertiesFileUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 用户认证和授权
 */
public class UpmsRealm extends AuthorizingRealm{

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRealm.class);

    @Autowired
    private UpmsApiService upmsApiService;

    /**
     * 授权：验证权限时调用
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        LOGGER.info(">>>>>>用户授权");
        String username = (String) principalCollection.getPrimaryPrincipal();
        UpmsUser upmsUser = upmsApiService.selectUpmsUserByUsername(username);

        //当前用户的所有角色
        List<UpmsRole> upmsRoles = upmsApiService.selectUpmsRoleByUserId(upmsUser.getId());
        Set<String> roles = new HashSet<>();
        for (UpmsRole upmsRole : upmsRoles){
            if (StringUtils.isNotBlank(upmsRole.getName())){
                roles.add(upmsRole.getName());
            }
        }

        //TODO：没写完
        //当前用户所有的权限
        List<UpmsPermission> upmsPermissions = upmsApiService.selectUpmsUserPermissionByUserId(upmsUser.getId());
        Set<String> permissions = new HashSet<>();
        for (UpmsPermission upmsPermission : upmsPermissions){
            if (StringUtils.isNotBlank(upmsPermission.getValue())) {
                upmsPermission.getValue();
            }
        }

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setStringPermissions(permissions);
        simpleAuthorizationInfo.setRoles(roles);

        return simpleAuthorizationInfo;
    }


    /**
     * 认证：登录时调用
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        LOGGER.info(">>>>>>登录认证");

        //principal（主要的；首长，校长，当事人）在这里是登录用户的意思
        //Credential（凭证）在这里是密码的意思
        String username = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
//        // client无密认证
//        String upmsType = PropertiesFileUtil.getInstance("zheng-upms-client").get("zheng.upms.type");
//        if ("client".equals(upmsType)) {
//            return new SimpleAuthenticationInfo(username, password, getName());
//        }
        // 查询用户信息
        UpmsUser upmsUser = upmsApiService.selectUpmsUserByUsername(username);

        if (null == upmsUser){
            throw new UnknownAccountException();
        }
        if (!upmsUser.getPassword().equals(MD5Util.md5(password + upmsUser.getSalt()))){
            throw new IncorrectCredentialsException();
        }
        if (upmsUser.getLocked() == 1) {
            throw new LockedAccountException();
        }

        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
