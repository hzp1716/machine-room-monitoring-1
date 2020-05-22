package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.NotifierlistMapper;
import com.windthunder.machineroom.monitoring.service.NotifierlistService;
@Service
public class NotifierlistServiceImpl implements NotifierlistService{

    @Resource
    private NotifierlistMapper notifierlistMapper;

}
