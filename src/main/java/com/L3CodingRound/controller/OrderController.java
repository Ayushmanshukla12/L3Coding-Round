package com.L3CodingRound.controller;

import com.L3CodingRound.dto.Orderdto;
import com.L3CodingRound.service.implementationClass.OrderServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderController {
    @Autowired
    private OrderServiceClass orderServiceClass;

    @PostMapping("/orderItenory")
    public String orderItenory(@RequestBody Orderdto orderdto){
        return this.orderServiceClass.orderItenary(orderdto);
    }
}
