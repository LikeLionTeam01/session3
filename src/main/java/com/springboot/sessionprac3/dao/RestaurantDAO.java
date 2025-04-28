package com.springboot.sessionprac3.dao;

import com.springboot.sessionprac3.entity.Restaurant;

public interface RestaurantDAO {

    Restaurant insertRestaurant(Restaurant restaurant);

    Restaurant selectRestaurant(long id);

    Restaurant updateRestaurant(Restaurant restaurant) throws Exception;

    void deleteRestaurant(long id) throws Exception;
}
