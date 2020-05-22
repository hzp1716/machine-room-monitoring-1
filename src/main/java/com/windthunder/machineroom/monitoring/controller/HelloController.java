package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Usr;
import com.windthunder.machineroom.monitoring.mapper.UsrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author Administrator
 */
@Controller
public class HelloController {

    @Autowired
    private UsrMapper usrMapper;

    @ResponseBody
    @RequestMapping("/hello/{name}")
    public Usr hello(@PathVariable("name") String name){
        Usr usr=usrMapper.getByUsername(name);
        return usr;
    }

}
