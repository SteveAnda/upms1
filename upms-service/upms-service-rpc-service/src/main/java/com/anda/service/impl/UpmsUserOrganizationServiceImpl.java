package com.anda.service.impl;

import com.anda.base.BaseServiceImpl;
import com.anda.mapper.UpmsUserOrganizationMapper;
import com.anda.pojo.UpmsUserOrganization;
import com.anda.pojo.UpmsUserOrganizationExample;
import com.anda.service.UpmsUserOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpmsUserOrganizationServiceImpl extends BaseServiceImpl<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserOrganizationServiceImpl.class);

    @Autowired
    UpmsUserOrganizationMapper upmsUserOrganizationMapper;


}
