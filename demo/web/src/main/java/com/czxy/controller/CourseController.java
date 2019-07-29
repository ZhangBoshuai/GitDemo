package com.czxy.controller;

import com.czxy.domain.Course;
import com.czxy.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;

    @GetMapping("findAll")
    public ResponseEntity<List<Course>> findAll() {
        try {
            List<Course> byAll = courseService.findByAll(null);
            System.out.println(byAll);
            return ResponseEntity.ok(byAll);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
