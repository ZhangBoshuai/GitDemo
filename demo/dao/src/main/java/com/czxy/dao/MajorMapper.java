package com.czxy.dao;
import com.czxy.domain.Major;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MajorMapper extends tk.mybatis.mapper.common.Mapper<Major> {

    List<Major> findByAll(Major major);

    Major findFirstByMajorId(@Param("majorId")Integer majorId);


}