package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Collector;

import java.util.List;

public interface CollectorService{

    List<Collector> findByAll(Collector collector);

}
