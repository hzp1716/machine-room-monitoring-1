package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.SyssettingMapper;
import com.windthunder.machineroom.monitoring.service.SyssettingService;
@Service
public class SyssettingServiceImpl implements SyssettingService{

    @Resource
    private SyssettingMapper syssettingMapper;

}
