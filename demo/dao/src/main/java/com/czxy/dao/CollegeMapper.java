package com.czxy.dao;
import org.apache.ibatis.annotations.Param;

import com.czxy.domain.College;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollegeMapper extends tk.mybatis.mapper.common.Mapper<College> {
    College findFirstByCollegeId(@Param("collegeId")Integer collegeId);


}