package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.windthunder.machineroom.monitoring.domain.Alarmpolicy;
import tk.mybatis.mapper.MyMapper;

public interface AlarmpolicyMapper extends MyMapper<Alarmpolicy> {
    List<Alarmpolicy> findByAll(Alarmpolicy alarmpolicy);


}