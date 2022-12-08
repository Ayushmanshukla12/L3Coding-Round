package com.L3CodingRound.service.serviceInterface;

import com.L3CodingRound.dto.FoodDto;
import com.L3CodingRound.entities.FoodDetails;
import com.L3CodingRound.entities.Restaurant;

import java.util.List;

public interface RestaurantServiceInterface {

    public String addRestaurant(Restaurant restaurant);

    public String addFood(FoodDto foodDto);

    public List<FoodDetails> showAllFood(int rId);

    public List<Restaurant> showRestaurant();
}
