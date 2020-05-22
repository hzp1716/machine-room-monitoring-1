package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Halarm12003Mapper;
import com.windthunder.machineroom.monitoring.service.Halarm12003Service;
@Service
public class Halarm12003ServiceImpl implements Halarm12003Service{

    @Resource
    private Halarm12003Mapper halarm12003Mapper;

}
