package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Halarm12004Mapper;
import com.windthunder.machineroom.monitoring.service.Halarm12004Service;
@Service
public class Halarm12004ServiceImpl implements Halarm12004Service{

    @Resource
    private Halarm12004Mapper halarm12004Mapper;

}
