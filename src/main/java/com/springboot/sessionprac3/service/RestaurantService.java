package com.springboot.sessionprac3.service;

import com.springboot.sessionprac3.dto.ChangeNameRequestDto;
import com.springboot.sessionprac3.dto.RequestDto;
import com.springboot.sessionprac3.dto.ResponseDto;
import com.springboot.sessionprac3.entity.Restaurant;

public interface RestaurantService {

    ResponseDto getRestaurant(Long id) throws Exception;

    ResponseDto saveRestaurant(RequestDto requestDto);

    ResponseDto changeRestaurantName(ChangeNameRequestDto changeNameRequestDto) throws Exception;

    void deleteRestaurant(Long id) throws Exception;

}
