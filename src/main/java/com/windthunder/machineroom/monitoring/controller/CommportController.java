package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Commport;
import com.windthunder.machineroom.monitoring.mapper.CommportMapper;
import com.windthunder.machineroom.monitoring.service.CommportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/commport")
public class CommportController {
    @Autowired
    private CommportService commportService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Commport> commportList(){
        Commport commport=new Commport();
        return commportService.findByAll(commport);
    }
}
