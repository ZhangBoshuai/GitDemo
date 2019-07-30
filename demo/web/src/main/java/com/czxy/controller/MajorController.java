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

    @PutMapping("/updateByMajor")
    public ResponseEntity<Object> updateByMajor(Major major) {
        majorService.updateByMajor(major);
        return new ResponseEntity<>(HttpStatus.RESET_CONTENT);
    }

    @PostMapping
    public ResponseEntity<Object> add(Major major) {
        majorService.add(major);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/findByMajor/{majorId}")
    public ResponseEntity<Major> findByMajor(@PathVariable Integer majorId) {
        Major byMajor = majorService.findByMajor(majorId);
        return ResponseEntity.ok(byMajor);
    }

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
