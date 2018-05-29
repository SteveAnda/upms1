package com.anda.service.impl;

import com.anda.base.BaseServiceImpl;
import com.anda.mapper.UpmsPermissionMapper;
import com.anda.pojo.UpmsPermission;
import com.anda.pojo.UpmsPermissionExample;
import com.anda.service.UpmsPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpmsPermissionServiceImpl extends BaseServiceImpl<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsPermissionServiceImpl.class);

    @Autowired
    UpmsPermissionMapper upmsPermissionMapper;
}
