package com.anda.service.impl;

import com.anda.base.BaseServiceImpl;
import com.anda.mapper.UpmsUserPermissionMapper;
import com.anda.pojo.UpmsUserPermission;
import com.anda.pojo.UpmsUserPermissionExample;
import com.anda.service.UpmsUserPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpmsUserPermissionServiceImpl extends BaseServiceImpl<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserPermissionServiceImpl.class);

    @Autowired
    UpmsUserPermissionMapper upmsUserPermissionMapper;
}
