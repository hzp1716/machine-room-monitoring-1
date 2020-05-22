package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.ReportperiodMapper;
import com.windthunder.machineroom.monitoring.service.ReportperiodService;
@Service
public class ReportperiodServiceImpl implements ReportperiodService{

    @Resource
    private ReportperiodMapper reportperiodMapper;

}
