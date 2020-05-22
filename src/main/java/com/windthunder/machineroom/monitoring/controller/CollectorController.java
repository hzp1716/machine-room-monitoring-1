package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Collector;
import com.windthunder.machineroom.monitoring.mapper.CollectorMapper;
import com.windthunder.machineroom.monitoring.service.CollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/collector")
public class CollectorController {
    @Autowired
    private CollectorService collectorService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Collector> collectorList(){
        Collector collector=new Collector();
        return collectorService.findByAll(collector);
    }

}
