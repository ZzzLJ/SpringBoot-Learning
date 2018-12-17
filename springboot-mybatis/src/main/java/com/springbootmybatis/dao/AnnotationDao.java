package com.springbootmybatis.dao;

import com.springbootmybatis.model.City;
import com.springbootmybatis.model.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper // 标志为 Mybatis 的 Mapper
public interface AnnotationDao {
    //@Select("SELECT * FROM city where city_name = #{cityName}")
    @Select("SELECT * FROM city where city_name = #{param1}")
    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description")
    })
    List<City> findByName(@Param("cityName") String cityName);

    @Insert("insert into user values(#{id},#{name},#{time})")
    int insert(User user);

    @Select("select * from user")
    List<User> findUsers();
}
