package com.springbootshiro.service;

import com.springbootshiro.domain.User;

public interface ILoginService {
    User findByUserName(String userName);
}
