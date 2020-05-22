package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Alarmpolicy;

import java.util.List;

public interface AlarmpolicyService{
    List<Alarmpolicy> findByAll(Alarmpolicy alarmpolicy);

}
