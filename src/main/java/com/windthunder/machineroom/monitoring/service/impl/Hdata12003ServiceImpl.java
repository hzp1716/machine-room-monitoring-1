package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Hdata12003Mapper;
import com.windthunder.machineroom.monitoring.service.Hdata12003Service;
@Service
public class Hdata12003ServiceImpl implements Hdata12003Service{

    @Resource
    private Hdata12003Mapper hdata12003Mapper;

}
