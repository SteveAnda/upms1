package com.anda.service.impl;

import com.anda.base.BaseServiceImpl;
import com.anda.mapper.UpmsUserRoleMapper;
import com.anda.pojo.UpmsUserRole;
import com.anda.pojo.UpmsUserRoleExample;
import com.anda.service.UpmsUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpmsUserRoleServiceImpl extends BaseServiceImpl<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserRoleServiceImpl.class);

    @Autowired
    UpmsUserRoleMapper upmsUserRoleMapper;
}
