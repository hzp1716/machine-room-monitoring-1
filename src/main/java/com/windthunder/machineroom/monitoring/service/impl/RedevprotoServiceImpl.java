package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.RedevprotoMapper;
import com.windthunder.machineroom.monitoring.service.RedevprotoService;
@Service
public class RedevprotoServiceImpl implements RedevprotoService{

    @Resource
    private RedevprotoMapper redevprotoMapper;

}
