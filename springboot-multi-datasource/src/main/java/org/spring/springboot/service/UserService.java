package org.spring.springboot.service;

import org.spring.springboot.domain.User;

public interface UserService {
    User findByName(String userName);
}
