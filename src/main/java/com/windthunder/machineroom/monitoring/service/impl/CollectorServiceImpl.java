package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Collector;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.CollectorMapper;
import com.windthunder.machineroom.monitoring.service.CollectorService;

import java.util.List;

@Service
public class CollectorServiceImpl implements CollectorService{

    @Resource
    private CollectorMapper collectorMapper;


    @Override
    public List<Collector> findByAll(Collector collector) {
        return collectorMapper.findByAll(collector);
    }
}
