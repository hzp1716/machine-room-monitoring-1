package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.BindingitemMapper;
import com.windthunder.machineroom.monitoring.service.BindingitemService;
@Service
public class BindingitemServiceImpl implements BindingitemService{

    @Resource
    private BindingitemMapper bindingitemMapper;

}
