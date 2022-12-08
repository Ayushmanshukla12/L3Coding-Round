package com.L3CodingRound.controller;

import com.L3CodingRound.dto.FoodDto;
import com.L3CodingRound.entities.FoodDetails;
import com.L3CodingRound.entities.Restaurant;
import com.L3CodingRound.repository.FoodDetailsRepository;
import com.L3CodingRound.repository.RestaurantRepository;
import com.L3CodingRound.service.implementationClass.RestaurantServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private FoodDetailsRepository foodDetailsRepository;
    @Autowired
    private RestaurantServiceClass restaurantServiceClass;

    @PostMapping("/addRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return this.restaurantServiceClass.addRestaurant(restaurant);
    }

    @PostMapping("/addFoodtoRestaurant")
    public String addFood(@RequestBody FoodDto foodDto){
        return this.restaurantServiceClass.addFood(foodDto);
    }

    @GetMapping("/showAllFood/{rid}")
    public List<FoodDetails> showAllFood(@PathVariable int rid){
        return this.restaurantServiceClass.showAllFood(rid);
    }

    @GetMapping("/showRestaurant")
    public List<Restaurant> showRestaurant(){
        return this.restaurantServiceClass.showRestaurant();
    }
}
