package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Halarm12005Mapper;
import com.windthunder.machineroom.monitoring.service.Halarm12005Service;
@Service
public class Halarm12005ServiceImpl implements Halarm12005Service{

    @Resource
    private Halarm12005Mapper halarm12005Mapper;

}
