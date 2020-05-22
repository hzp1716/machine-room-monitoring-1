package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.SubsysAccessRtlogMapper;
import com.windthunder.machineroom.monitoring.service.SubsysAccessRtlogService;
@Service
public class SubsysAccessRtlogServiceImpl implements SubsysAccessRtlogService{

    @Resource
    private SubsysAccessRtlogMapper subsysAccessRtlogMapper;

}
