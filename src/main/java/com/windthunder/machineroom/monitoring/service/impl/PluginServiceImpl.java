package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PluginMapper;
import com.windthunder.machineroom.monitoring.service.PluginService;
@Service
public class PluginServiceImpl implements PluginService{

    @Resource
    private PluginMapper pluginMapper;

}
