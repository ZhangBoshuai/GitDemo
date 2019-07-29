package com.czxy.dao;

import com.czxy.domain.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper extends tk.mybatis.mapper.common.Mapper<Course> {
}