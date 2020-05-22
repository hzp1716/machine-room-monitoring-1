package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Role;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.RoleMapper;
import com.windthunder.machineroom.monitoring.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> findByAll(Role role) {
        return roleMapper.findByAll(role);
    }
}
