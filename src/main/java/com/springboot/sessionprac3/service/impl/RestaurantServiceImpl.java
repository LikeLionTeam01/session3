package com.springboot.sessionprac3.service.impl;

import com.springboot.sessionprac3.dao.RestaurantDAO;
import com.springboot.sessionprac3.dto.ChangeNameRequestDto;
import com.springboot.sessionprac3.dto.RequestDto;
import com.springboot.sessionprac3.dto.ResponseDto;
import com.springboot.sessionprac3.entity.Restaurant;
import com.springboot.sessionprac3.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantDAO restaurantDAO;

    @Autowired
    public RestaurantServiceImpl(RestaurantDAO restaurantDAO){
        this.restaurantDAO = restaurantDAO;
    }

    @Override
    public ResponseDto getRestaurant(Long id) throws Exception {
        Restaurant restaurant = restaurantDAO.selectRestaurant(id);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(restaurant.getId());
        responseDto.setName(restaurant.getName());
        responseDto.setAddress(restaurant.getAddress());
        responseDto.setNumber(restaurant.getNumber());
        responseDto.setPrice(restaurant.getPrice());
        responseDto.setMenu(restaurant.getMenu());

        return responseDto;
    }

    @Override
    public ResponseDto saveRestaurant(RequestDto requestDto){
        Restaurant restaurant = new Restaurant();
        restaurant.setName(requestDto.getName());
        restaurant.setAddress(requestDto.getAddress());
        restaurant.setNumber(requestDto.getNumber());
        restaurant.setPrice(requestDto.getPrice());
        restaurant.setMenu(requestDto.getMenu());

        Restaurant savedRestaurant = restaurantDAO.insertRestaurant(restaurant);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(savedRestaurant.getId());
        responseDto.setName(savedRestaurant.getName());
        responseDto.setAddress(savedRestaurant.getAddress());
        responseDto.setNumber(savedRestaurant.getNumber());
        responseDto.setPrice(savedRestaurant.getPrice());
        responseDto.setMenu(savedRestaurant.getMenu());

        return responseDto;
    }

    @Override
    public ResponseDto changeRestaurantName(ChangeNameRequestDto changeNameRequestDto) throws Exception {
        Restaurant updatedRestaurant = restaurantDAO.updateRestaurant(
                changeNameRequestDto.getId(),
                changeNameRequestDto.getName()
        );

        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(updatedRestaurant.getId());
        responseDto.setName(updatedRestaurant.getName());
        responseDto.setAddress(updatedRestaurant.getAddress());
        responseDto.setNumber(updatedRestaurant.getNumber());
        responseDto.setPrice(updatedRestaurant.getPrice());
        responseDto.setMenu(updatedRestaurant.getMenu());

        return responseDto;
    }
}
