package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.LinkalarmMapper;
import com.windthunder.machineroom.monitoring.service.LinkalarmService;
@Service
public class LinkalarmServiceImpl implements LinkalarmService{

    @Resource
    private LinkalarmMapper linkalarmMapper;

}
