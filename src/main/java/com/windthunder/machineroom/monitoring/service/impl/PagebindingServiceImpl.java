package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PagebindingMapper;
import com.windthunder.machineroom.monitoring.service.PagebindingService;
@Service
public class PagebindingServiceImpl implements PagebindingService{

    @Resource
    private PagebindingMapper pagebindingMapper;

}
