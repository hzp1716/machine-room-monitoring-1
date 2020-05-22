package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Syslog;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.SyslogMapper;
import com.windthunder.machineroom.monitoring.service.SyslogService;

import java.util.List;

@Service
public class SyslogServiceImpl implements SyslogService{

    @Resource
    private SyslogMapper syslogMapper;

    @Override
    public List<Syslog> findByAll(Syslog syslog) {
        return syslogMapper.findByAll(syslog);
    }
}
