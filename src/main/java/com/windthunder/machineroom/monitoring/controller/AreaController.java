package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Area;
import com.windthunder.machineroom.monitoring.mapper.AreaMapper;
import com.windthunder.machineroom.monitoring.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/area")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Area> areaList(){
        Area area=new Area();
        return areaService.findByAll(area);
    }
}
