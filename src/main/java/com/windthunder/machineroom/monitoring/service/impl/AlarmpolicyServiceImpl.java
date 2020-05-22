package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Alarmpolicy;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.AlarmpolicyMapper;
import com.windthunder.machineroom.monitoring.service.AlarmpolicyService;

import java.util.List;

@Service
public class AlarmpolicyServiceImpl implements AlarmpolicyService{

    @Resource
    private AlarmpolicyMapper alarmpolicyMapper;


    @Override
    public List<Alarmpolicy> findByAll(Alarmpolicy alarmpolicy) {
        return alarmpolicyMapper.findByAll(alarmpolicy);
    }
}
