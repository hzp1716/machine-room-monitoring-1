package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.windthunder.machineroom.monitoring.domain.Collector;
import tk.mybatis.mapper.MyMapper;

public interface CollectorMapper extends MyMapper<Collector> {
    List<Collector> findByAll(Collector collector);


}