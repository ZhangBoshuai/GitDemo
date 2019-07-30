package com.czxy.service;
import com.czxy.domain.College;

import java.util.List;

public interface CollegeService{



	List<College> findByCollegeId(Integer collegeId);


	void insertCollege(College college);

	List<College>  findAllCollege();


	void delCollege(String collegeId);

	void updateCollege(College college);

	College findOneCollege( String collegeId);
}
