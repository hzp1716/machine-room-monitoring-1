package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Hdata12004Mapper;
import com.windthunder.machineroom.monitoring.service.Hdata12004Service;
@Service
public class Hdata12004ServiceImpl implements Hdata12004Service{

    @Resource
    private Hdata12004Mapper hdata12004Mapper;

}
