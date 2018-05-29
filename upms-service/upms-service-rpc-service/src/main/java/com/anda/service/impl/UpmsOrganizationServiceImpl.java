package com.anda.service.impl;

import com.anda.base.BaseServiceImpl;
import com.anda.mapper.UpmsOrganizationMapper;
import com.anda.pojo.UpmsOrganization;
import com.anda.pojo.UpmsOrganizationExample;
import com.anda.service.UpmsOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper upmsOrganizationMapper;
}
