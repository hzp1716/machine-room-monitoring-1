package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Device;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.DeviceMapper;
import com.windthunder.machineroom.monitoring.service.DeviceService;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService{

    @Resource
    private DeviceMapper deviceMapper;

    @Override
    public List<Device> findByAll(Device device) {
        return deviceMapper.findByAll(device);
    }
}
