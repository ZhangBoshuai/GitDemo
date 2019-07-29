package com.czxy.service.impl;
import java.util.List;
import com.czxy.domain.Student;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.czxy.dao.StudentMapper;
import com.czxy.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public List<Student> findByAll(Student student){
		 return studentMapper.findByAll(student);
	}




    @Resource
    private StudentMapper studentMapper;

}
