package com.anda.service;


import com.anda.pojo.*;

import java.util.List;

/**
 * upms系统接口
 * 用户授权信息使用单独的缓存方法
 */
public interface UpmsApiService {

    /**
     * 根据用户id获取所拥有的权限(用户和角色权限合集)
     * @param userId
     * @return
     */
//    List<UpmsPermission> selectUpmsPermissionByUserId(Integer userId);

//    List<UpmsPermission> selectUpmsPermissionByUserIdByCache(Integer userId);

    /**
     * 根据用户id获取所属的角色
     * @param userId
     * @return
     */
    List<UpmsRole> selectUpmsRoleByUserId(Integer userId);

    List<UpmsRole> selectUpmsRoleByUserIdByCache(Integer userId);

    /**
     * 根据角色id获取所拥有的权限
     * @param roleId
     * @return
     */
    List<UpmsRolePermission> selectUpmsRolePermissionByRoleId(Integer roleId);

    /**
     * 根据用户id获取所拥有的权限
     * @param userId
     * @return
     */
    List<UpmsPermission> selectUpmsUserPermissionByUserId(Integer userId);

    /**
     * 根据username获取UpmsUser
     * @param username
     * @return
     */
    UpmsUser selectUpmsUserByUsername(String username);

    /**
     * 写入操作日志
     * @param record
     * @return
     */
    int insertUpmsLogSelective(UpmsLog record);
}
