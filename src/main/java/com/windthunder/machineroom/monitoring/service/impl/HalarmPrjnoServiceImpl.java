package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.HalarmPrjnoMapper;
import com.windthunder.machineroom.monitoring.service.HalarmPrjnoService;
@Service
public class HalarmPrjnoServiceImpl implements HalarmPrjnoService{

    @Resource
    private HalarmPrjnoMapper halarmPrjnoMapper;

}
