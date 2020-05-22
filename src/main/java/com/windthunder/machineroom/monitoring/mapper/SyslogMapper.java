package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Date;

import com.windthunder.machineroom.monitoring.domain.Syslog;
import tk.mybatis.mapper.MyMapper;

public interface SyslogMapper extends MyMapper<Syslog> {
    List<Syslog> findByAll(Syslog syslog);


}