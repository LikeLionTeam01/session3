package com.springboot.sessionprac3.controller;


import com.springboot.sessionprac3.dto.ChangeNameRequestDto;
import com.springboot.sessionprac3.dto.RequestDto;
import com.springboot.sessionprac3.dto.ResponseDto;
import com.springboot.sessionprac3.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/restaurant")
public class RestaurantController {
    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService=restaurantService;
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseDto> getRestaurant(@RequestParam Long id) throws Exception {
        ResponseDto responseDto = restaurantService.getRestaurant(id);
        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseDto> createRestaurant(@RequestBody RequestDto requestDto) {
        ResponseDto responseDto = restaurantService.saveRestaurant(requestDto);
        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }

    @PutMapping("/put")
    public ResponseEntity<ResponseDto> updateRestaurant(@RequestBody ChangeNameRequestDto changeNameRequestDto) throws Exception {
        ResponseDto responseDto = restaurantService.changeRestaurantName(changeNameRequestDto);
        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteRestaurant(@RequestParam Long id) throws Exception {
        restaurantService.deleteRestaurant(id);
        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }


}
