package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.VideoinfoMapper;
import com.windthunder.machineroom.monitoring.service.VideoinfoService;
@Service
public class VideoinfoServiceImpl implements VideoinfoService{

    @Resource
    private VideoinfoMapper videoinfoMapper;

}
