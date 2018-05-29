package com.anda.mapper;

import java.util.List;

import com.anda.pojo.UpmsPermission;
import com.anda.pojo.UpmsRole;

/**
 * 联合操作方法
 * @author LeeCP
 *
 */
public interface UpmsApiMapper {
	/**
	 * 根据用户Id返回权限
	 * @return 权限集合
	 */
	List<UpmsPermission> selectUpmsPermissionByUpmsUserId(Integer upmsUserId);
	
	/**
	 * 根据角色Id返回权限
	 * @return 权限集合
	 */
	List<UpmsPermission> selectUpmsPermissionByUpmsRoleId(Integer upmsRoleId);
	
	/**
	 * 根据用户Id返回角色
	 * @return 角色集合
	 */
	List<UpmsRole> selectUpmsRoleByUpmsUserId(Integer upmsUserId);
}
