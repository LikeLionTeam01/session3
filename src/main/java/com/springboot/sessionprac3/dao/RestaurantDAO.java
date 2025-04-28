package com.springboot.sessionprac3.dao;

import com.springboot.sessionprac3.entity.Restaurant;

public interface RestaurantDAO {

    Restaurant insertRestaurant(Restaurant restaurant);

    Restaurant selectRestaurant(Long id) throws Exception;

    Restaurant updateRestaurant(Long id, String name) throws Exception;

    void deleteRestaurant(Long id) throws Exception;
}
