package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PrivilegeMapper;
import com.windthunder.machineroom.monitoring.service.PrivilegeService;
@Service
public class PrivilegeServiceImpl implements PrivilegeService{

    @Resource
    private PrivilegeMapper privilegeMapper;

}
