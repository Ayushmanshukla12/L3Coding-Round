package com.L3CodingRound.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orderdto {

    private int userId;
    private int restaurantId;
    private int deliverPartnerId;
    private int orderId;
}
