package com.czxy.controller;

import com.czxy.domain.Major;
import com.czxy.domain.Student;
import com.czxy.domain.StudentVo;
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
     * 模糊查询功能
     */

    @GetMapping("/search")
    public ResponseEntity<List<Student>> search(Student student){
        try {
            List<Student> studentList = studentService.findByStudentNameLike(student.getStudentName());
            return ResponseEntity.ok(studentList);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     * 编辑功能
     */
    @PutMapping("/edit")
    public ResponseEntity<Void> edit(Student student){
        try {
            studentService.updateByStudentId(student,student.getStudentId());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     *编辑回显
     */
    @GetMapping("/editShow/{sid}")
    public ResponseEntity<StudentVo> editShow(@PathVariable Integer sid){
        try {
            Student student = studentService.findByStudentId(sid);
            List<Major> majorList = majorService.findByAll(null);
            StudentVo studentVo=new StudentVo();
            studentVo.setMajorList(majorList);
            studentVo.setStudent(student);
            return ResponseEntity.ok(studentVo);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


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
