package com.czxy.service.impl;
import java.util.List;
import com.czxy.domain.College;
import com.czxy.dao.CollegeMapper;
import com.czxy.service.CollegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Override
	public List<College> findByCollegeId(Integer collegeId){
		 return collegeMapper.findByCollegeId(collegeId);
	}






    @Resource
    private CollegeMapper collegeMapper;




}
