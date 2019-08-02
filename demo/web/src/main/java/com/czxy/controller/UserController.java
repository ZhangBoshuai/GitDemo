package com.czxy.controller;

import com.czxy.domain.User;
import com.czxy.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public ResponseEntity<Void> login(HttpSession session,User user){
        System.out.println(user);
        User userByUserName = userService.findByUsernameAndPassword(user);
        if (userByUserName!=null){
            session.setAttribute("loginU",userByUserName);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
        @GetMapping("loginOut")
        public ResponseEntity<Void> loginOut(HttpServletRequest request){
            try {
                request.getSession().removeAttribute("loginU");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
}
