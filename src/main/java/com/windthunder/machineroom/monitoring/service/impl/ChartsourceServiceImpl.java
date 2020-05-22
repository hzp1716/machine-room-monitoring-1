package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.ChartsourceMapper;
import com.windthunder.machineroom.monitoring.service.ChartsourceService;
@Service
public class ChartsourceServiceImpl implements ChartsourceService{

    @Resource
    private ChartsourceMapper chartsourceMapper;

}
