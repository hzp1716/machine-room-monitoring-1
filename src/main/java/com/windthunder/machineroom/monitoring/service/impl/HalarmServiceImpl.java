package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.HalarmMapper;
import com.windthunder.machineroom.monitoring.service.HalarmService;
@Service
public class HalarmServiceImpl implements HalarmService{

    @Resource
    private HalarmMapper halarmMapper;

}
