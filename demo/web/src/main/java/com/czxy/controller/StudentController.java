package com.czxy.controller;

import com.czxy.domain.Student;
import com.czxy.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @GetMapping
    public ResponseEntity<List<Student>> findByAll(){
        List<Student> byAll = studentService.findByAll(null);
        return ResponseEntity.ok(byAll);
    }
}
