package com.czxy.service;
import com.czxy.domain.Student;

import java.util.List;

public interface StudentService{



	List<Student> findByAll(Student student);



	int insertSelective(Student student);



	Student findByStudentName(String studentName);





}
