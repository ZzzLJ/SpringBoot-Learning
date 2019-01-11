package com.springbootswagger2.service;

import com.springbootswagger2.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUser();

    User findUserById(Long id);

    void createUser(User user);

    void update(User user);

    void deleteUserById(Long id);
}
