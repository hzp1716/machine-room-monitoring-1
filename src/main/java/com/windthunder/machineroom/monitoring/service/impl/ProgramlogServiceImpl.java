package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.ProgramlogMapper;
import com.windthunder.machineroom.monitoring.service.ProgramlogService;
@Service
public class ProgramlogServiceImpl implements ProgramlogService{

    @Resource
    private ProgramlogMapper programlogMapper;

}
