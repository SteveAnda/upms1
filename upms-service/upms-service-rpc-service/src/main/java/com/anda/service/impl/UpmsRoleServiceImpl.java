package com.anda.service.impl;

import com.anda.base.BaseServiceImpl;
import com.anda.mapper.UpmsRoleMapper;
import com.anda.pojo.UpmsRole;
import com.anda.pojo.UpmsRoleExample;
import com.anda.service.UpmsRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpmsRoleServiceImpl extends BaseServiceImpl<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRoleServiceImpl.class);

    @Autowired
    UpmsRoleMapper upmsRoleMapper;

}
