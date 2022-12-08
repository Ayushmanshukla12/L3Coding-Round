package com.L3CodingRound.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FoodDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodId;
    private String foodName;
    private int foodSales;
    @ManyToOne
    private Restaurant restaurant;
}
