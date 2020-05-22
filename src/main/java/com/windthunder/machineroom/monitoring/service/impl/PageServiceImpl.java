package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PageMapper;
import com.windthunder.machineroom.monitoring.service.PageService;
@Service
public class PageServiceImpl implements PageService{

    @Resource
    private PageMapper pageMapper;

}
