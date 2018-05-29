package com.anda.service.impl;

import com.anda.base.BaseServiceImpl;
import com.anda.mapper.UpmsUserMapper;
import com.anda.pojo.UpmsUser;
import com.anda.pojo.UpmsUserExample;
import com.anda.service.UpmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpmsUserServiceImpl extends BaseServiceImpl<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserServiceImpl.class);

    @Autowired
    UpmsUserMapper upmsUserMapper;
}
