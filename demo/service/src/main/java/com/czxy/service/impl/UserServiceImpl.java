package com.czxy.service.impl;
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


	@Override
	public User findByUsernameAndPassword(String username, String password) {
		List<User> byUsername = userMapper.findByUsernameAndPassword(username,password);

		if (byUsername!=null){
			return byUsername.get(0);
		}else{

			return null;
		}
	}
}
