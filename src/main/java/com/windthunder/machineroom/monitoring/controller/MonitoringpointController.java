package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Monitoringpoint;
import com.windthunder.machineroom.monitoring.service.MonitoringpointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/monitoringpoint")
public class MonitoringpointController {
    @Autowired
    private MonitoringpointService monitoringpointService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Monitoringpoint> monitoringpointList(){
        Monitoringpoint monitoringpoint=new Monitoringpoint();
        return monitoringpointService.findByAll(monitoringpoint);
    }
}
