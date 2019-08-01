package com.czxy.controller;

import com.czxy.domain.User;
import com.czxy.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public ResponseEntity<Void> login(User user, HttpServletRequest request){
        if (user.getUsername().length()!=0){
            User userByUserName = userService.findByUsernameAndPassword(user);
            if (userByUserName!=null){
                request.getSession().setAttribute("loginUser",userByUserName);
                return new ResponseEntity<>(HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }else{
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }
}
