package com.springboot.sessionprac3.repository;
import com.springboot.sessionprac3.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, String> {
    Optional<Restaurant> findByAddress(String name);
}
