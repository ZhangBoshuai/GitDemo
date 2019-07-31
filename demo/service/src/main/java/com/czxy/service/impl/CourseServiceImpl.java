package com.czxy.service.impl;
import com.czxy.dao.CourseMapper;
import com.czxy.domain.Course;
import com.czxy.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

	@Override
	public List<Course> findByAll(Course course){
		 return courseMapper.findByAll(course);
	}

	@Override
	public int insertSelective(Course course){
		 return courseMapper.insertSelective(course);
	}

	@Override
	public int deleteByCourseCid(Integer courseCid){
		 return courseMapper.deleteByCourseCid(courseCid);
	}

	@Override
	public Course findByCourseCid(Integer courseCid){
		 return courseMapper.findByCourseCid(courseCid);
	}

































    @Resource
    private CourseMapper courseMapper;

}
