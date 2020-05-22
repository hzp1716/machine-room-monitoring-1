package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PeriodsitemMapper;
import com.windthunder.machineroom.monitoring.service.PeriodsitemService;
@Service
public class PeriodsitemServiceImpl implements PeriodsitemService{

    @Resource
    private PeriodsitemMapper periodsitemMapper;

}
