package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.LinkagesrcMapper;
import com.windthunder.machineroom.monitoring.service.LinkagesrcService;
@Service
public class LinkagesrcServiceImpl implements LinkagesrcService{

    @Resource
    private LinkagesrcMapper linkagesrcMapper;

}
