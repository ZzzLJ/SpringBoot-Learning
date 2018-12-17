package com.springbootmybatis.service;

import com.springbootmybatis.model.City;
import java.util.List;

public interface CityService {
    List<City> findAllCity();

    City findCityById(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
