package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PeriodsMapper;
import com.windthunder.machineroom.monitoring.service.PeriodsService;
@Service
public class PeriodsServiceImpl implements PeriodsService{

    @Resource
    private PeriodsMapper periodsMapper;

}
