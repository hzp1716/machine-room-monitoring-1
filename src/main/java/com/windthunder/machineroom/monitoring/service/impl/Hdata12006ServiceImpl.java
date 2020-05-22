package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Hdata12006Mapper;
import com.windthunder.machineroom.monitoring.service.Hdata12006Service;
@Service
public class Hdata12006ServiceImpl implements Hdata12006Service{

    @Resource
    private Hdata12006Mapper hdata12006Mapper;

}
