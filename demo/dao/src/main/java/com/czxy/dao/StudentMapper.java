package com.czxy.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.czxy.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends tk.mybatis.mapper.common.Mapper<Student> {
    List<Student> findByAll(Student student);
    int insertSelective(@Param("student")Student student);





}