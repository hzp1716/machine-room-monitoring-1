package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Role;

import java.util.List;

public interface RoleService{
    List<Role> findByAll(Role role);

}
