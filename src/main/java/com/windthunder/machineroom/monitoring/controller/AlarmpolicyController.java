package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Alarmpolicy;
import com.windthunder.machineroom.monitoring.mapper.AlarmpolicyMapper;
import com.windthunder.machineroom.monitoring.service.AlarmpolicyService;
import com.windthunder.machineroom.monitoring.service.impl.AlarmpolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("alarmpolicy")
public class AlarmpolicyController {
    @Autowired
    private AlarmpolicyService alarmpolicyService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Alarmpolicy> alarmpolicyList(){
        Alarmpolicy alarmpolicy=new Alarmpolicy();
        return alarmpolicyService.findByAll(alarmpolicy);
    }


}
