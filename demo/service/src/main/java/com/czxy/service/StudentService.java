package com.czxy.service;
import java.util.List;
import com.czxy.domain.Student;

public interface StudentService{



	List<Student> findByAll(Student student);



	int insertSelective(Student student);




}
