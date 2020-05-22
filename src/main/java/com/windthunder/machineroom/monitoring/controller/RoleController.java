package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Role;
import com.windthunder.machineroom.monitoring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Role> roleList(){
        Role role=new Role();
        return roleService.findByAll(role);
    }
}
