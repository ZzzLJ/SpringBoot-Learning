package com.springboot.service.impl;

import com.springboot.service.UserService;
import com.springboot.pojo.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: ZzzLJ
 *
 */
@Service
public class UserServiceImpl implements UserService {

    private static List<User> users;

    static {
        users = initUser();
    }

    //使用静态数据模拟
    private static List<User> initUser() {
        List<User> users = new ArrayList<>(10);
        users.add(new User(1L,"Mac"));
        users.add(new User(2L,"HuaWei"));
        users.add(new User(3L,"3Idiots"));
        users.add(new User(4L,"Cartoon"));
        users.add(new User(5L,"TUHao"));
        return users;
    }

    @Override
    public List<User> getUser() {
        return users;
    }

    @Override
    public User findUserById(Long id) {
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {
        int index = users.indexOf(user);
        users.add(index,user);
    }

    @Override
    public void deleteUserById(Long id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
            }
        }
    }
}