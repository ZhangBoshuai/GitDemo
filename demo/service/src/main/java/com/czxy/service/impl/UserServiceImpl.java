package com.czxy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.czxy.dao.UserMapper;
import com.czxy.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

}
