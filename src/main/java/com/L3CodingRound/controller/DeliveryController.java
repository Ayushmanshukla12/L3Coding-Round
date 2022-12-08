package com.L3CodingRound.controller;

import com.L3CodingRound.entities.DeliveryPartner;
import com.L3CodingRound.service.implementationClass.DeliveryPartnerImplClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DeliveryController {
    @Autowired
    private DeliveryPartnerImplClass deliveryPartnerImplClass;

    @PostMapping("/addDeliveryPartner")
    public String addDeliveryPartner(@RequestBody DeliveryPartner deliveryPartner){
        return this.deliveryPartnerImplClass.addDeliveryPartner(deliveryPartner);
    }
}
