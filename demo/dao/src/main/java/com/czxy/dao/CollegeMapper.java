package com.czxy.dao;
import org.apache.ibatis.annotations.Param;

import com.czxy.domain.College;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollegeMapper extends tk.mybatis.mapper.common.Mapper<College> {

    List<College> findByCollegeId(@Param("collegeId")Integer collegeId);


}