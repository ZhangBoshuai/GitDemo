package com.czxy.service;
import com.czxy.domain.Course;

import java.util.List;
public interface CourseService{



	List<Course> findByAll(Course course);



	int insertSelective(Course course);



	int deleteByCourseCid(Integer courseCid);



	Course findByCourseCid(Integer courseCid);



	int updateByCourseCid(Course updated,Integer courseCid);











}
