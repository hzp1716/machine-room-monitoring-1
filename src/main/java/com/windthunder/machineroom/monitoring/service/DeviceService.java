package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Device;

import java.util.List;

public interface DeviceService{
    List<Device> findByAll(Device device);

}
