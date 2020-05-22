package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.ReceiverMapper;
import com.windthunder.machineroom.monitoring.service.ReceiverService;
@Service
public class ReceiverServiceImpl implements ReceiverService{

    @Resource
    private ReceiverMapper receiverMapper;

}
