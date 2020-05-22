package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.AssetlinkMapper;
import com.windthunder.machineroom.monitoring.service.AssetlinkService;
@Service
public class AssetlinkServiceImpl implements AssetlinkService{

    @Resource
    private AssetlinkMapper assetlinkMapper;

}
