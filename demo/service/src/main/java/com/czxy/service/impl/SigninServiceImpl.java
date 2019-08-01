package com.czxy.service.impl;

import com.czxy.dao.SigninMapper;
import com.czxy.service.SigninService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class SigninServiceImpl implements SigninService {

    @Resource
    private SigninMapper signinMapper;

}
