package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.BindingMapper;
import com.windthunder.machineroom.monitoring.service.BindingService;
@Service
public class BindingServiceImpl implements BindingService{

    @Resource
    private BindingMapper bindingMapper;

}
