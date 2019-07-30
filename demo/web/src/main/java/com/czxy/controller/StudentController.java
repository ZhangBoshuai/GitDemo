package com.czxy.controller;

import com.czxy.domain.Major;
import com.czxy.domain.Student;
import com.czxy.service.MajorService;
import com.czxy.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private MajorService majorService;

    @GetMapping("/getMar")
    public ResponseEntity<List<Major>> getMajor(){
        try {
            List<Major> majorList = majorService.findByAll(null);
            return ResponseEntity.ok(majorList);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addStu")
    public ResponseEntity<Void> addStu(Student student){
        Student stu = studentService.findByStudentName(student.getStudentName());
        if (stu==null){
            studentService.insertSelective(student);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findAllStu")
    public ResponseEntity<List<Student>> findByAll(){
        List<Student> byAll = null;

        try {
            byAll = studentService.findByAll(null);
            return ResponseEntity.ok(byAll);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
