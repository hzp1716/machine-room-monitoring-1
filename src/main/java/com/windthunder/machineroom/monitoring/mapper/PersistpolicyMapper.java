package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.windthunder.machineroom.monitoring.domain.Persistpolicy;
import tk.mybatis.mapper.MyMapper;

public interface PersistpolicyMapper extends MyMapper<Persistpolicy> {
    List<Persistpolicy> findByAll(Persistpolicy persistpolicy);


}