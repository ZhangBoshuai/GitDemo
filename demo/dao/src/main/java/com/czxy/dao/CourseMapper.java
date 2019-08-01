package com.czxy.dao;
import org.apache.ibatis.annotations.Param;
import com.czxy.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper extends tk.mybatis.mapper.common.Mapper<Course> {

    List<Course> findByAll(Course course);


    int insertSelective(@Param("course")Course course);


   int deleteByCourseCid(@Param("courseCid")Integer courseCid);

    Course findByCourseCid(@Param("courseCid")Integer courseCid);

    int updateByCourseCid(@Param("updated")Course updated,@Param("courseCid")Integer courseCid);









}