package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Persistpolicy;
import com.windthunder.machineroom.monitoring.service.PersistpolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/persistpolicy")
public class PersistpolicyController {
    @Autowired
    private PersistpolicyService persistpolicyService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Persistpolicy> persistpolicyList(){
        Persistpolicy persistpolicy=new Persistpolicy();
        return persistpolicyService.findByAll(persistpolicy);
    }

}
