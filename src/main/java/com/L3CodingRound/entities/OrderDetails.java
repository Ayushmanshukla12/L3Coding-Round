package com.L3CodingRound.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String orderStatus;
    private Time estimatedTimeOfArrival;
    @ManyToOne
    private User user;
    @ManyToOne
    private Restaurant restaurant;
    @ManyToOne
    private DeliveryPartner deliveryPartner;
}
