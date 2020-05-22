package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.windthunder.machineroom.monitoring.domain.Device;
import tk.mybatis.mapper.MyMapper;

public interface DeviceMapper extends MyMapper<Device> {
    List<Device> findByAll(Device device);


}