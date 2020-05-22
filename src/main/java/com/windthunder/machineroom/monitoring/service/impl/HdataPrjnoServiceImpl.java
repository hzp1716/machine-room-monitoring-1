package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.HdataPrjnoMapper;
import com.windthunder.machineroom.monitoring.service.HdataPrjnoService;
@Service
public class HdataPrjnoServiceImpl implements HdataPrjnoService{

    @Resource
    private HdataPrjnoMapper hdataPrjnoMapper;

}
