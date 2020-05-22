package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Halarm12006Mapper;
import com.windthunder.machineroom.monitoring.service.Halarm12006Service;
@Service
public class Halarm12006ServiceImpl implements Halarm12006Service{

    @Resource
    private Halarm12006Mapper halarm12006Mapper;

}
