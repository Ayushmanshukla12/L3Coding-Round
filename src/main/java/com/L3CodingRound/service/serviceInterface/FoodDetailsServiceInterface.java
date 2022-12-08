package com.L3CodingRound.service.serviceInterface;

import com.L3CodingRound.entities.FoodDetails;

import java.util.List;

public interface FoodDetailsServiceInterface {

    public String addFoodItems(FoodDetails foodDetails);

    public List<FoodDetails> showFoodDetails();
}
