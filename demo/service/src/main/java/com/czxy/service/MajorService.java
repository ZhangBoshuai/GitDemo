package com.czxy.service;
import java.util.List;
import com.czxy.domain.Major;

public interface MajorService{



	List<Major> findByAll(Major major);


    void del(Integer majorId);


    void add(Major major);

    Major findByMajor(Integer majorId);

    void updateByMajor(Major major);
}
