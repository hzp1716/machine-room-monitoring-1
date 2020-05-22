package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.LinkageMapper;
import com.windthunder.machineroom.monitoring.service.LinkageService;
@Service
public class LinkageServiceImpl implements LinkageService{

    @Resource
    private LinkageMapper linkageMapper;

}
