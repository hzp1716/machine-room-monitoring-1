package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PagelinkageMapper;
import com.windthunder.machineroom.monitoring.service.PagelinkageService;
@Service
public class PagelinkageServiceImpl implements PagelinkageService{

    @Resource
    private PagelinkageMapper pagelinkageMapper;

}
