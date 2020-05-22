package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Monitoringpoint;

import java.util.List;

public interface MonitoringpointService{
    List<Monitoringpoint> findByAll(Monitoringpoint monitoringpoint);
}
