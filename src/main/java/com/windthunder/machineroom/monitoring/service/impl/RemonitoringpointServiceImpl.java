package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.RemonitoringpointMapper;
import com.windthunder.machineroom.monitoring.service.RemonitoringpointService;
@Service
public class RemonitoringpointServiceImpl implements RemonitoringpointService{

    @Resource
    private RemonitoringpointMapper remonitoringpointMapper;

}
