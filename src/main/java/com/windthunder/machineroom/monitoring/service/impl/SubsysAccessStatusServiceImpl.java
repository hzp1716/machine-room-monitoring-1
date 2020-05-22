package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.SubsysAccessStatusMapper;
import com.windthunder.machineroom.monitoring.service.SubsysAccessStatusService;
@Service
public class SubsysAccessStatusServiceImpl implements SubsysAccessStatusService{

    @Resource
    private SubsysAccessStatusMapper subsysAccessStatusMapper;

}
