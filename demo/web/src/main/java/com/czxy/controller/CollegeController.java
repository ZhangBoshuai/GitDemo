package com.czxy.controller;


import com.czxy.domain.College;
import com.czxy.service.CollegeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
            return new ResponseEntity<>(HttpStatus.OK);
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

}
