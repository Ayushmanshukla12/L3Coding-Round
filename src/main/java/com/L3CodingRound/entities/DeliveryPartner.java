package com.L3CodingRound.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deliveryPartnerId;
    private int deliveryPartnerX_Co_ordinate;
    private int deliveryPartnerY_Co_ordinate;
    private String deliveryPartnerName;

    @OneToMany(mappedBy = "deliveryPartner")
    private List<OrderDetails> orderList;
}
