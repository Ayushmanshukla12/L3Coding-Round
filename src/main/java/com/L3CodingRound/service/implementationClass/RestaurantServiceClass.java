package com.L3CodingRound.service.implementationClass;

import com.L3CodingRound.dto.FoodDto;
import com.L3CodingRound.dto.Orderdto;
import com.L3CodingRound.entities.FoodDetails;
import com.L3CodingRound.entities.Restaurant;
import com.L3CodingRound.repository.FoodDetailsRepository;
import com.L3CodingRound.repository.RestaurantRepository;
import com.L3CodingRound.service.serviceInterface.RestaurantServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceClass implements RestaurantServiceInterface {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private FoodDetailsRepository foodDetailsRepository;

    @Override
    public String addRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
        return "restaurant added";
    }

    @Override
    public String  addFood(FoodDto foodDto) {
        FoodDetails foodDetails = foodDetailsRepository.getById(foodDto.getFoodId());
        Restaurant restaurant=restaurantRepository.getById(foodDto.getRestaurantId());
        List<FoodDetails> foodDetailsList = new ArrayList<>();
        foodDetailsList.add(foodDetails);
        restaurant.setFoodDetailsList(foodDetailsList);
        foodDetails.setRestaurant(restaurant);
        foodDetailsRepository.save(foodDetails);
        restaurantRepository.save(restaurant);
        return "food added to restaurant succesfully";
    }

    @Override
    public List<FoodDetails> showAllFood(int rid) {
        Restaurant restaurant = restaurantRepository.findById(rid).get();
        return restaurant.getFoodDetailsList();
    }

    @Override
    public List<Restaurant> showRestaurant() {

        List<Restaurant> list = restaurantRepository.findAll();
        list.stream().sorted(Comparator.comparing(Restaurant::getRestaurantRating)).collect(Collectors.toList());
        return list;
    }




}
