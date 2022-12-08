package com.L3CodingRound.repository;

import com.L3CodingRound.entities.OrderDetails;
import com.L3CodingRound.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
}
