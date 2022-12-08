package com.L3CodingRound.repository;

import com.L3CodingRound.entities.FoodDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodDetailsRepository extends JpaRepository<FoodDetails,Integer> {
}
