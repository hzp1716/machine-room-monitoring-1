package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.RecollectorMapper;
import com.windthunder.machineroom.monitoring.service.RecollectorService;
@Service
public class RecollectorServiceImpl implements RecollectorService{

    @Resource
    private RecollectorMapper recollectorMapper;

}
