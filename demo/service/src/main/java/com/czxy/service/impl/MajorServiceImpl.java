package com.czxy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.czxy.dao.MajorMapper;
import com.czxy.service.MajorService;
@Service
public class MajorServiceImpl implements MajorService{

    @Resource
    private MajorMapper majorMapper;

}
