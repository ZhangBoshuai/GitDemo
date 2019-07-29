package com.czxy.dao;
import com.czxy.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper extends tk.mybatis.mapper.common.Mapper<Course> {
    List<Course> findByAll(Course course);




}