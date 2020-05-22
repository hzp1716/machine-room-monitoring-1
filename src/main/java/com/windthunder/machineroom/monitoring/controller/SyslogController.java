package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Syslog;
import com.windthunder.machineroom.monitoring.service.SyslogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/syslog")
public class SyslogController {
    @Autowired
    private SyslogService syslogService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Syslog> syslogList(){
        Syslog syslog=new Syslog();
        return syslogService.findByAll(syslog);
    }
}
