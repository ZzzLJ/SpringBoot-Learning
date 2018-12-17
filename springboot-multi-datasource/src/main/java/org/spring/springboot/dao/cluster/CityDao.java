package org.spring.springboot.dao.cluster;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

@Mapper
public interface CityDao {
    City findByName(@Param("cityName") String cityName);
}
