package com.atguigu.dao;

import com.atguigu.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> queryUsers();

    Integer queryCount();

}
