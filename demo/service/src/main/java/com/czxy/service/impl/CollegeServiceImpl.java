package com.czxy.service.impl;

import com.czxy.service.CollegeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.czxy.dao.CollegeMapper;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Resource
    private CollegeMapper collegeMapper;

}
