package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.windthunder.machineroom.monitoring.domain.Monitoringpoint;
import tk.mybatis.mapper.MyMapper;

public interface MonitoringpointMapper extends MyMapper<Monitoringpoint> {
    List<Monitoringpoint> findByAll(Monitoringpoint monitoringpoint);


}