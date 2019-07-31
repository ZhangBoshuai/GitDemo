package com.czxy.service.impl;
import com.czxy.dao.MajorMapper;
import com.czxy.domain.Major;
import com.czxy.service.MajorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MajorServiceImpl implements MajorService{

	@Override
	public List<Major> findByAll(Major major){
		 return majorMapper.findByAll(major);
	}

	@Override
	public void del(Integer majorId) {
		majorMapper.deleteByPrimaryKey(majorId);
	}

    @Override
    public void add(Major major) {
        majorMapper.insert(major);
    }

	@Override
	public Major findByMajor(Integer majorId) {
		Major major = majorMapper.selectByPrimaryKey(majorId);
		return major;
	}

	@Override
	public void updateByMajor(Major major) {
		majorMapper.updateByPrimaryKey(major);
	}


	@Resource
    private MajorMapper majorMapper;

}
