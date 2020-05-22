package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Commport;

import java.util.List;

public interface CommportService{
    List<Commport> findByAll(Commport commport);
}
