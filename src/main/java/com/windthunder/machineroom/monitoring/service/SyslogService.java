package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Syslog;

import java.util.List;

public interface SyslogService{
    List<Syslog> findByAll(Syslog syslog);

}
