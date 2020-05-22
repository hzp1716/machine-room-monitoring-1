package com.windthunder.machineroom.monitoring.mapper;

import com.windthunder.machineroom.monitoring.domain.Usr;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface UsrMapper extends MyMapper<Usr> {
    Usr getByUsername(@Param("name") String name);
}