package com.czxy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.czxy.dao.CourseMapper;
import com.czxy.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{

    @Resource
    private CourseMapper courseMapper;

}
