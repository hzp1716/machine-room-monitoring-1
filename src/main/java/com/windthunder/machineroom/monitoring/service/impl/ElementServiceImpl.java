package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.ElementMapper;
import com.windthunder.machineroom.monitoring.service.ElementService;
@Service
public class ElementServiceImpl implements ElementService{

    @Resource
    private ElementMapper elementMapper;

}
