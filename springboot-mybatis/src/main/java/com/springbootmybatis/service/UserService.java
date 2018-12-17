package com.springbootmybatis.service;

import com.springbootmybatis.model.User;

import java.util.List;

public interface UserService {
    List<User> findUserByName(String name);
}
