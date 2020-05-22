package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.FixlogMapper;
import com.windthunder.machineroom.monitoring.service.FixlogService;
@Service
public class FixlogServiceImpl implements FixlogService{

    @Resource
    private FixlogMapper fixlogMapper;

}
