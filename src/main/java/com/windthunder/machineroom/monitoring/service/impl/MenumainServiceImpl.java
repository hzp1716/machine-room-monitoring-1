package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.MenumainMapper;
import com.windthunder.machineroom.monitoring.service.MenumainService;
@Service
public class MenumainServiceImpl implements MenumainService{

    @Resource
    private MenumainMapper menumainMapper;

}
