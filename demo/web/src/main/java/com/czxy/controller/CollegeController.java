package com.czxy.controller;


import com.czxy.domain.College;
import com.czxy.service.CollegeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {



    @Resource
    private CollegeService collegeService;

    @GetMapping("/addCollege")
    public ResponseEntity<Void>   insertCollege(College college){

        try {
            collegeService.insertCollege(college);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findAllCollege")
    public ResponseEntity<List<College>>  findAllCollege(){
        try {
            List<College> list = collegeService.findAllCollege();
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("del/{collegeId}")
    public ResponseEntity<Void>  delCollege(@PathVariable String collegeId){
        try {
            collegeService.delCollege(collegeId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping("/updateCollege")
    public ResponseEntity<Void>   updateCollege(College college){

        try {
            collegeService.updateCollege(college);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findOneCollege/{collegeId}")
    public ResponseEntity<College>  findOneCollege(@PathVariable String collegeId){
        try {
            College college = collegeService.findOneCollege(collegeId);
            return ResponseEntity.ok(college);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
