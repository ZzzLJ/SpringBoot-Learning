package com.springbootshiro.service.impl;

import com.springbootshiro.domain.User;
import com.springbootshiro.service.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {
    @Override
    public User findByUserName(String userName) {
        return null;
    }
}
