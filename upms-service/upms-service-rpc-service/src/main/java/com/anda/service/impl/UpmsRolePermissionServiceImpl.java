package com.anda.service.impl;

import com.anda.base.BaseServiceImpl;
import com.anda.mapper.UpmsRolePermissionMapper;
import com.anda.pojo.UpmsRolePermission;
import com.anda.pojo.UpmsRolePermissionExample;
import com.anda.service.UpmsRolePermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpmsRolePermissionServiceImpl extends BaseServiceImpl<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRolePermissionServiceImpl.class);

    @Autowired
    UpmsRolePermissionMapper upmsRolePermissionMapper;
}
