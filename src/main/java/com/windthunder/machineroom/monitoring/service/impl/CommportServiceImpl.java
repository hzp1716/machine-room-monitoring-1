package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Commport;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.CommportMapper;
import com.windthunder.machineroom.monitoring.service.CommportService;

import java.util.List;

@Service
public class CommportServiceImpl implements CommportService{

    @Resource
    private CommportMapper commportMapper;

    @Override
    public List<Commport> findByAll(Commport commport) {

        return commportMapper.findByAll(commport);
    }
}
