package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.VersioninfoMapper;
import com.windthunder.machineroom.monitoring.service.VersioninfoService;
@Service
public class VersioninfoServiceImpl implements VersioninfoService{

    @Resource
    private VersioninfoMapper versioninfoMapper;

}
