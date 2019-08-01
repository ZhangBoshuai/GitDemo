package com.czxy.controller;

import com.czxy.domain.College;
import com.czxy.domain.Course;
import com.czxy.domain.CourseVo;
import com.czxy.service.CollegeService;
import com.czxy.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;
    @Resource
    private CollegeService collegeService;

    /**
     * 展示所有课程
     * @return
     */
    @GetMapping("findAll")
    public ResponseEntity<List<Course>> findAll() {
        try {
            List<Course> byAll = courseService.findByAll(null);
            return ResponseEntity.ok(byAll);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 课程添加
     * @param course
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity<Void> add( Course course){
        try {
            courseService.insertSelective(course);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 课程删除功能
     * @param cid
     * @return
     */
    @DeleteMapping("/del/{cid}")
    public ResponseEntity<Void>del(@PathVariable Integer cid){
        try {
            courseService.deleteByCourseCid(cid);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 根据id  编辑回显功能
     * @param cid
     * @return
     */
    @GetMapping("/editShow/{cid}")
    public ResponseEntity<CourseVo>editShow(@PathVariable Integer cid) {
        try {
            Course course = courseService.findByCourseCid(cid);
            List<College> collegeList = collegeService.findAllCollege();
            CourseVo courseVo = new CourseVo();
            courseVo.setCourse(course);
            courseVo.setCourseList(collegeList);
            return ResponseEntity.ok(courseVo) ;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 根据对象 ，对象id'  实现编辑回显功能
     * @param course
     * @return
     */
    @PutMapping("/edit")
    public ResponseEntity<Void>edit(Course course){
        try {
            courseService.updateByCourseCid(course,course.getCourseCid());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
