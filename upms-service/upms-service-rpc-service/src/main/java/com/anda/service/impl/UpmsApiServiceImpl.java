package com.anda.service.impl;

import com.anda.mapper.UpmsRoleMapper;
import com.anda.mapper.UpmsRolePermissionMapper;
import com.anda.mapper.UpmsUserMapper;
import com.anda.mapper.UpmsUserPermissionMapper;
import com.anda.pojo.*;
import com.anda.service.UpmsApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UpmsApiServiceImpl implements UpmsApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsApiServiceImpl.class);

    @Autowired
    UpmsRoleMapper upmsRoleMapper;

    @Autowired
    UpmsRolePermissionMapper upmsRolePermissionMapper;

    @Autowired
    UpmsUserPermissionMapper upmsUserPermissionMapper;

    @Autowired
    UpmsUserMapper upmsUserMapper;

    @Override
    public List<UpmsRole> selectUpmsRoleByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<UpmsRole> selectUpmsRoleByUserIdByCache(Integer userId) {
        return null;
    }

    @Override
    public List<UpmsRolePermission> selectUpmsRolePermissionByRoleId(Integer roleId) {
        return null;
    }

    @Override
    public List<UpmsPermission> selectUpmsUserPermissionByUserId(Integer userId) {

        //我觉得这段没有必要，因为已经在Authentication认证那里验证了用户是否存在或者锁定
        // 用户不存在或锁定状态
//        UpmsUser upmsUser = upmsUserMapper.selectByPrimaryKey(userId);
//        if (null == upmsUser || 1 == upmsUser.getLocked()) {
//            LOGGER.info("selectUpmsPermissionByUpmsUserId : upmsUserId={}", userId);
//            return null;
//        }
        //TODO：还有个接口没写
//        List<UpmsPermission> upmsPermissions =

        return null;
    }

    @Override
    public UpmsUser selectUpmsUserByUsername(String username) {

        UpmsUserExample upmsUserExample = new UpmsUserExample();
        upmsUserExample.createCriteria()
                .andUsernameEqualTo(username);
        List<UpmsUser> upmsUser = upmsUserMapper.selectByExample(upmsUserExample);
        if (null != upmsUser && upmsUser.size() > 0){
            return upmsUser.get(0);
        }
        return null;
    }

    @Override
    public int insertUpmsLogSelective(UpmsLog record) {
        return 0;
    }
}
