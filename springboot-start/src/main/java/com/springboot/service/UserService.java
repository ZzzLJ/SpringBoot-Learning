package com.springboot.service;

import com.springboot.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUser();

    User findUserById(Long id);

    void createUser(User user);

    void update(User user);

    void deleteUserById(Long id);
}
