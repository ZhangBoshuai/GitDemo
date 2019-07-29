package com.czxy.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.czxy.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
 List<User> findByUsernameAndPassword(@Param("username")String username,@Param("password")String password);

}