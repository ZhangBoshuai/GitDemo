package com.czxy.service;
import com.czxy.domain.College;

import java.util.List;

public interface CollegeService{


	void insertCollege(College college);

	List<College>  findAllCollege();


}
