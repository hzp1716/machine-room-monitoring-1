package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.windthunder.machineroom.monitoring.domain.Role;
import tk.mybatis.mapper.MyMapper;

public interface RoleMapper extends MyMapper<Role> {
    List<Role> findByAll(Role role);


}