package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.DevicemgrMapper;
import com.windthunder.machineroom.monitoring.service.DevicemgrService;
@Service
public class DevicemgrServiceImpl implements DevicemgrService{

    @Resource
    private DevicemgrMapper devicemgrMapper;

}
