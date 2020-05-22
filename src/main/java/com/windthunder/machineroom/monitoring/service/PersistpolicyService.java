package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Persistpolicy;

import java.util.List;

public interface PersistpolicyService{
    List<Persistpolicy> findByAll(Persistpolicy persistpolicy);

}
