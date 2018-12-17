package com.springbootmybatis.service.impl;

import com.springbootmybatis.dao.UserDao;
import com.springbootmybatis.model.User;
import com.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
