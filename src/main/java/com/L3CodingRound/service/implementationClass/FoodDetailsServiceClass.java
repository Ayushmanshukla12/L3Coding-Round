package com.L3CodingRound.service.implementationClass;

import com.L3CodingRound.entities.FoodDetails;
import com.L3CodingRound.repository.FoodDetailsRepository;
import com.L3CodingRound.service.serviceInterface.FoodDetailsServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodDetailsServiceClass implements FoodDetailsServiceInterface {
    @Autowired
    private FoodDetailsRepository foodDetailsRepository;
    @Override
    public String addFoodItems(FoodDetails foodDetails) {
        foodDetailsRepository.save(foodDetails);
        return "food items added succesfully";
    }

    @Override
    public List<FoodDetails> showFoodDetails() {
        List<FoodDetails> list = foodDetailsRepository.findAll();
        list.stream().sorted(Comparator.comparing(FoodDetails::getFoodSales)).collect(Collectors.toList());
        return list;
    }
}
