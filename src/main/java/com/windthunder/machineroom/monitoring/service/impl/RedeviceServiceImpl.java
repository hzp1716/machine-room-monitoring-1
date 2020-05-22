package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.RedeviceMapper;
import com.windthunder.machineroom.monitoring.service.RedeviceService;
@Service
public class RedeviceServiceImpl implements RedeviceService{

    @Resource
    private RedeviceMapper redeviceMapper;

}
