package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Usr;

public interface UsrService{
    Usr getByUsername(String name);

}
