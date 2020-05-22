package com.windthunder.machineroom.monitoring.mapper;
import org.apache.ibatis.annotations.Param;

import com.windthunder.machineroom.monitoring.domain.Accounts;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface AccountsMapper extends MyMapper<Accounts> {
    @Override
    List<Accounts> selectAll();
    List<Accounts> findByAll(Accounts accounts);


}