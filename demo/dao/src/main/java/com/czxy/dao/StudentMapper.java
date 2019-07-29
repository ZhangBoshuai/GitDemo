package com.czxy.dao;
import com.czxy.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper extends tk.mybatis.mapper.common.Mapper<Student> {

    List<Student> findByAll(Student student);

    int insertSelective(@Param("student")Student student);

}