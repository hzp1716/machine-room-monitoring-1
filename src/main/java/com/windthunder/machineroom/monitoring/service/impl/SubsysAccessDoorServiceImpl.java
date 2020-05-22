package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.SubsysAccessDoorMapper;
import com.windthunder.machineroom.monitoring.service.SubsysAccessDoorService;
@Service
public class SubsysAccessDoorServiceImpl implements SubsysAccessDoorService{

    @Resource
    private SubsysAccessDoorMapper subsysAccessDoorMapper;

}
