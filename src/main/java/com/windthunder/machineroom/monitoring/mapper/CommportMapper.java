package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.windthunder.machineroom.monitoring.domain.Commport;
import tk.mybatis.mapper.MyMapper;

public interface CommportMapper extends MyMapper<Commport> {
    List<Commport> findByAll(Commport commport);


}