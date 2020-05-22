package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Device;
import com.windthunder.machineroom.monitoring.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Device> deviceList(){
        Device device=new Device();
        return deviceService.findByAll(device);
    }
}
