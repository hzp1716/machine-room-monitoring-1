package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.Hdata12005Mapper;
import com.windthunder.machineroom.monitoring.service.Hdata12005Service;
@Service
public class Hdata12005ServiceImpl implements Hdata12005Service{

    @Resource
    private Hdata12005Mapper hdata12005Mapper;

}
