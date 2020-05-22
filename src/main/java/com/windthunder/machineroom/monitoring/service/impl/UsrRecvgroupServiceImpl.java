package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.UsrRecvgroupMapper;
import com.windthunder.machineroom.monitoring.service.UsrRecvgroupService;
@Service
public class UsrRecvgroupServiceImpl implements UsrRecvgroupService{

    @Resource
    private UsrRecvgroupMapper usrRecvgroupMapper;

}
