package com.springbootmybatis.dao;

import com.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: ZzzLJ
 */
@Mapper
public interface UserDao {
    @Select("select id,name from user where name = #{name}")
    List<User> findUserByName(String name);
}
