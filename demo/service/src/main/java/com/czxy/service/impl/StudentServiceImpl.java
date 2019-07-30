package com.czxy.service.impl;
import com.czxy.dao.StudentMapper;
import com.czxy.domain.Student;
import com.czxy.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{



	@Override
	public List<Student> findByAll(Student student){
		 return studentMapper.findByAll(student);
	}

	@Override
	public int insertSelective(Student student){
		 return studentMapper.insertSelective(student);
	}

	@Override
	public Student findByStudentName(String studentName){
		List<Student> stulist = studentMapper.findByStudentName(studentName);
		if (stulist.isEmpty()){
			return null;
		}else {
			return stulist.get(0);
		}
	}

	@Override
	public int deleteByStudentId(Integer studentId){
		 return studentMapper.deleteByStudentId(studentId);
	}

	@Override
	public Student findByStudentId(Integer studentId){
		 return studentMapper.findByStudentId(studentId);
	}

	@Override
	public int updateByStudentId(Student updated,Integer studentId){
		 return studentMapper.updateByStudentId(updated,studentId);
	}

	@Override
	public List<Student> findByStudentNameLike(String likeStudentName){
		 return studentMapper.findByStudentNameLike(likeStudentName);
	}



























    @Resource
    private StudentMapper studentMapper;

}
