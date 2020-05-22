package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.OntimetaskMapper;
import com.windthunder.machineroom.monitoring.service.OntimetaskService;
@Service
public class OntimetaskServiceImpl implements OntimetaskService{

    @Resource
    private OntimetaskMapper ontimetaskMapper;

}
