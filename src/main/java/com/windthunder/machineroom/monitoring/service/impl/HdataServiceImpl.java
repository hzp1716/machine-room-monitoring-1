package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.HdataMapper;
import com.windthunder.machineroom.monitoring.service.HdataService;
@Service
public class HdataServiceImpl implements HdataService{

    @Resource
    private HdataMapper hdataMapper;

}
