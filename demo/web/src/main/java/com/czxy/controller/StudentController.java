package com.czxy.controller;

import com.czxy.domain.Major;
import com.czxy.domain.Student;
import com.czxy.service.MajorService;
import com.czxy.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private MajorService majorService;


    /**
     *  根据studentId删除学生
     * @param sid
     * @return
     */
    @DeleteMapping("/del/{sid}")
    public ResponseEntity<Void> delStudent(@PathVariable Integer sid){
        try {
            studentService.deleteByStudentId(sid);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     * 添加页面 获取专业信息 填充专业下拉列表
     * @return
     */
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

    /**
     * 添加学生功能
     * @param student
     * @return
     */
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


    /**
     * 展示所有学生
     * @return
     */
    @GetMapping("/findAllStu")
    public ResponseEntity<List<Student>> findByAll(){


        try {
            List<Student> byAll = studentService.findByAll(null);
            return ResponseEntity.ok(byAll);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
