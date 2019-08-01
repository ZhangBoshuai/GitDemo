package com.czxy.service.impl;

import com.czxy.domain.Student;
import java.util.List;
import com.czxy.domain.User;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.czxy.dao.UserMapper;
import com.czxy.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    @Resource
    private com.czxy.dao.StudentMapper studentMapper;


    @Override
	public User findByUsernameAndPassword(User user) {
		List<User> byUsername = userMapper.findByUsernameAndPassword(user);

		if (byUsername.size()!=0){
			return byUsername.get(0);
		}else{
			return null;
		}
	}
}
