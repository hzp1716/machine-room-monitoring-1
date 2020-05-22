package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.SubsysAccessDeviceMapper;
import com.windthunder.machineroom.monitoring.service.SubsysAccessDeviceService;
@Service
public class SubsysAccessDeviceServiceImpl implements SubsysAccessDeviceService{

    @Resource
    private SubsysAccessDeviceMapper subsysAccessDeviceMapper;

}
