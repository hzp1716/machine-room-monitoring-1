package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.RecommportMapper;
import com.windthunder.machineroom.monitoring.service.RecommportService;
@Service
public class RecommportServiceImpl implements RecommportService{

    @Resource
    private RecommportMapper recommportMapper;

}
