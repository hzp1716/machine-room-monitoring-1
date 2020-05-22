package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Element;
import com.windthunder.machineroom.monitoring.domain.Usr;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.UsrMapper;
import com.windthunder.machineroom.monitoring.service.UsrService;
import tk.mybatis.mapper.entity.Example;

@Service
public class UsrServiceImpl implements UsrService{

    @Resource
    private UsrMapper usrMapper;

    @Override
    public Usr getByUsername(String name) {
        return usrMapper.getByUsername(name);
    }
}
