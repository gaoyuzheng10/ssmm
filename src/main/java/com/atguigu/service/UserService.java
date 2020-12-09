package com.atguigu.service;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> queryUsers(){
        List<User> users = userMapper.queryUsers();
        return users;
    };

    public Integer queryCount(){

        return userMapper.queryCount();
    };


}
