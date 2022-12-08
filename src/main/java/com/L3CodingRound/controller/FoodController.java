package com.L3CodingRound.controller;

import com.L3CodingRound.entities.FoodDetails;
import com.L3CodingRound.service.implementationClass.FoodDetailsServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class FoodController {
    @Autowired
    private FoodDetailsServiceClass foodDetailsServiceClass;


    @PostMapping("/addFood")
    public String addFood(@RequestBody FoodDetails foodDetails){
        return this.foodDetailsServiceClass.addFoodItems(foodDetails);
    }

    @GetMapping("/showFoodDetails")
    public List<FoodDetails> showFoodDetails(){
        return this.foodDetailsServiceClass.showFoodDetails();
    }
}
