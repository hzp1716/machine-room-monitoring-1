package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Persistpolicy;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PersistpolicyMapper;
import com.windthunder.machineroom.monitoring.service.PersistpolicyService;

import java.util.List;

@Service
public class PersistpolicyServiceImpl implements PersistpolicyService{

    @Resource
    private PersistpolicyMapper persistpolicyMapper;

    @Override
    public List<Persistpolicy> findByAll(Persistpolicy persistpolicy) {
        return persistpolicyMapper.findByAll(persistpolicy);
    }
}
