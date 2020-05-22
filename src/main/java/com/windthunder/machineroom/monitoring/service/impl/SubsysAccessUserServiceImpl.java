package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.SubsysAccessUserMapper;
import com.windthunder.machineroom.monitoring.service.SubsysAccessUserService;
@Service
public class SubsysAccessUserServiceImpl implements SubsysAccessUserService{

    @Resource
    private SubsysAccessUserMapper subsysAccessUserMapper;

}
