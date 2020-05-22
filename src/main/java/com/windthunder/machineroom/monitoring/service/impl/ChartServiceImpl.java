package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.ChartMapper;
import com.windthunder.machineroom.monitoring.service.ChartService;
@Service
public class ChartServiceImpl implements ChartService{

    @Resource
    private ChartMapper chartMapper;

}
