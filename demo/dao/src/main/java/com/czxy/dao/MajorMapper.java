package com.czxy.dao;
import java.util.List;
import com.czxy.domain.College;
import org.apache.ibatis.annotations.Param;

import com.czxy.domain.Major;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MajorMapper extends tk.mybatis.mapper.common.Mapper<Major> {

    Major findFirstByMajorId(@Param("majorId")Integer majorId);

    List<Major> findByAll(Major major);

}