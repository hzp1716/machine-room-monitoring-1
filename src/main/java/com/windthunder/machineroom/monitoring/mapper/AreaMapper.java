package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.windthunder.machineroom.monitoring.domain.Area;
import tk.mybatis.mapper.MyMapper;

public interface AreaMapper extends MyMapper<Area> {
    List<Area> findByAll(Area area);


}