package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.RiaNvgmenuMapper;
import com.windthunder.machineroom.monitoring.service.RiaNvgmenuService;
@Service
public class RiaNvgmenuServiceImpl implements RiaNvgmenuService{

    @Resource
    private RiaNvgmenuMapper riaNvgmenuMapper;

}
