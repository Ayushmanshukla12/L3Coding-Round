package com.L3CodingRound.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurantId;
    private int restaurantX_Co_ordinate;
    private int restaurantY_Co_ordinate;
    private int restaurantRating;
    private String restaurantName;
    private String orderStatus;

    @OneToMany(mappedBy = "restaurant")
    private List<FoodDetails> foodDetailsList;
    @OneToMany(mappedBy = "restaurant")
    private List<OrderDetails> orderList;
}
