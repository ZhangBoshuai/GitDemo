package com.czxy.controller;

import com.czxy.domain.Major;
import com.czxy.service.MajorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("major")
public class MajorController {
    @Resource
    private MajorService majorService;

    @DeleteMapping("del/{majorId}")
    public ResponseEntity<Object> del(@PathVariable Integer majorId){
        majorService.del(majorId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Major>> findByAll(){
        List<Major> byAll = majorService.findByAll(null);
        return ResponseEntity.ok(byAll);
    }
}
