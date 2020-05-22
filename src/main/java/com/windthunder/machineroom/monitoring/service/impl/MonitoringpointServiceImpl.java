package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Monitoringpoint;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.MonitoringpointMapper;
import com.windthunder.machineroom.monitoring.service.MonitoringpointService;

import java.util.List;

@Service
public class MonitoringpointServiceImpl implements MonitoringpointService{

    @Resource
    private MonitoringpointMapper monitoringpointMapper;


    @Override
    public List<Monitoringpoint> findByAll(Monitoringpoint monitoringpoint) {
        return monitoringpointMapper.findByAll(monitoringpoint);
    }
}
