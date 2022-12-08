package com.L3CodingRound.service.implementationClass;

import com.L3CodingRound.entities.DeliveryPartner;
import com.L3CodingRound.repository.DeliveryPartnerRepository;
import com.L3CodingRound.service.serviceInterface.DeliveryPartnerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPartnerImplClass implements DeliveryPartnerInterface {
    @Autowired
    private DeliveryPartnerRepository deliveryPartnerRepository;
    @Override
    public String addDeliveryPartner(DeliveryPartner deliveryPartner) {
        deliveryPartnerRepository.save(deliveryPartner);
        return "delivery partner added";
    }
}
