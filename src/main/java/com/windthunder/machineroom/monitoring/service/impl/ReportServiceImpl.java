package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.ReportMapper;
import com.windthunder.machineroom.monitoring.service.ReportService;
@Service
public class ReportServiceImpl implements ReportService{

    @Resource
    private ReportMapper reportMapper;

}
