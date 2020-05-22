package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.LinkitemMapper;
import com.windthunder.machineroom.monitoring.service.LinkitemService;
@Service
public class LinkitemServiceImpl implements LinkitemService{

    @Resource
    private LinkitemMapper linkitemMapper;

}
