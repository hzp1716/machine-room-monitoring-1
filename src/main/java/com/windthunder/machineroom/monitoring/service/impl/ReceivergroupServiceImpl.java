package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.ReceivergroupMapper;
import com.windthunder.machineroom.monitoring.service.ReceivergroupService;
@Service
public class ReceivergroupServiceImpl implements ReceivergroupService{

    @Resource
    private ReceivergroupMapper receivergroupMapper;

}
