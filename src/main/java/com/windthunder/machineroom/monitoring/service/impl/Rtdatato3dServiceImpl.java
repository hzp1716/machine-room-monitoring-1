package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Rtdatato3dMapper;
import com.windthunder.machineroom.monitoring.service.Rtdatato3dService;
@Service
public class Rtdatato3dServiceImpl implements Rtdatato3dService{

    @Resource
    private Rtdatato3dMapper rtdatato3dMapper;

}
