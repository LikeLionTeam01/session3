package com.springboot.sessionprac3.dao.impl;

import com.springboot.sessionprac3.dao.RestaurantDAO;
import com.springboot.sessionprac3.entity.Restaurant;
import com.springboot.sessionprac3.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RestaurantDAOImpl implements RestaurantDAO {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantDAOImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant insertRestaurant(Restaurant restaurant) {
        Restaurant result = restaurantRepository.save(restaurant);
        return result;
    }

    @Override
    public Restaurant selectRestaurant(Long id) throws Exception {
        Optional<Restaurant> restaurant = restaurantRepository.findById(id);

        if (restaurant.isPresent()) {
            Restaurant result = restaurant.get();
            return result;
        } else {
            throw new Exception("해당 ID에 해당하는 Restaurant이 존재하지 않습니다.");
        }
    }

    @Override
    public Restaurant updateRestaurant(Long id, String name) throws Exception {
        Optional<Restaurant> findRestaurant = restaurantRepository.findById(id);

        if (findRestaurant.isPresent()) {
            Restaurant restaurant = findRestaurant.get();
            restaurant.setName(name);
            return restaurantRepository.save(restaurant);
        } else {
            throw new Exception("해당 ID에 해당하는 Restaurant이 존재하지 않습니다.");
        }
    }

    @Override
    public void deleteRestaurant(Long id) throws Exception {
        Optional<Restaurant> findRestaurant = restaurantRepository.findById(id);

        if (findRestaurant.isPresent()) {
            Restaurant restaurant = findRestaurant.get();
            restaurantRepository.delete(restaurant);
        } else {
            throw new Exception("해당 ID에 해당하는 Restaurant이 존재하지 않습니다.");
        }
    }
}
