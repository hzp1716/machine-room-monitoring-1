package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Area;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.AreaMapper;
import com.windthunder.machineroom.monitoring.service.AreaService;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService{

    @Resource
    private AreaMapper areaMapper;

    @Override
    public List<Area> findByAll(Area area) {
        return areaMapper.findByAll(area);
    }
}
