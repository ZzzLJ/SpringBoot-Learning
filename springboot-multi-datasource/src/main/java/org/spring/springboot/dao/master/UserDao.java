package org.spring.springboot.dao.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.User;

@Mapper
public interface UserDao {
    User findByName(@Param("userName") String userName);
}
