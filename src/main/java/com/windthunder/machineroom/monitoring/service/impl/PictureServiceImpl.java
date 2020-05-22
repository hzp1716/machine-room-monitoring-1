package com.windthunder.machineroom.monitoring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.PictureMapper;
import com.windthunder.machineroom.monitoring.service.PictureService;
@Service
public class PictureServiceImpl implements PictureService{

    @Resource
    private PictureMapper pictureMapper;

}
