package com.czxy.service.impl;
import java.util.List;
import com.czxy.domain.Course;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.czxy.dao.CourseMapper;
import com.czxy.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{

	@Override
	public List<Course> findByAll(Course course){
		 return courseMapper.findByAll(course);
	}








    @Resource
    private CourseMapper courseMapper;

}
