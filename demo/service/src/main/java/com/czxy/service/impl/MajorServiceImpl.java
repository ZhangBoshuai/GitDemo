package com.czxy.service.impl;
import java.util.List;
import com.czxy.domain.Major;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.czxy.dao.MajorMapper;
import com.czxy.service.MajorService;
import org.springframework.transaction.annotation.Transactional;

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


	@Resource
    private MajorMapper majorMapper;

}
