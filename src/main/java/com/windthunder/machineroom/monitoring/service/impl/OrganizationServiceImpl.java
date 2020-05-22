package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.OrganizationMapper;
import com.windthunder.machineroom.monitoring.service.OrganizationService;
@Service
public class OrganizationServiceImpl implements OrganizationService{

    @Resource
    private OrganizationMapper organizationMapper;

}
