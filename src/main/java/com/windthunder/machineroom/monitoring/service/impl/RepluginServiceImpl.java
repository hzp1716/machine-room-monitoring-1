package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.RepluginMapper;
import com.windthunder.machineroom.monitoring.service.RepluginService;
@Service
public class RepluginServiceImpl implements RepluginService{

    @Resource
    private RepluginMapper repluginMapper;

}
