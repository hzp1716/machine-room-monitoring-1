package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.FunclibMapper;
import com.windthunder.machineroom.monitoring.service.FunclibService;
@Service
public class FunclibServiceImpl implements FunclibService{

    @Resource
    private FunclibMapper funclibMapper;

}
