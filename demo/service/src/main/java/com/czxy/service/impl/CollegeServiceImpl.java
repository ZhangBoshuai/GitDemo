package com.czxy.service.impl;
import com.czxy.dao.CollegeMapper;
import com.czxy.domain.College;
import com.czxy.service.CollegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.CollationElementIterator;
import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {


	@Override
	public void insertCollege(College college) {
		collegeMapper.insert(college);
	}

	@Override
	public List<College> findAllCollege() {
		return collegeMapper.selectAll();
	}


	@Resource
    private CollegeMapper collegeMapper;

}
