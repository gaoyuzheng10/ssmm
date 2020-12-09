package com.atguigu.controller;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/list")
    public List<User> list(){
        System.out.println("list");
        List<User> users = userService.queryUsers();
        System.out.println(users);
        return users;
    }

    @ResponseBody
    @RequestMapping(value = "/count")
    public String count(){
        System.out.println("count");
        Integer integer = userService.queryCount();
        System.out.println(integer);
        return "/index.jsp";
    }


}
