package com.L3CodingRound.service.implementationClass;

import com.L3CodingRound.dto.Orderdto;
import com.L3CodingRound.entities.DeliveryPartner;
import com.L3CodingRound.entities.OrderDetails;
import com.L3CodingRound.entities.Restaurant;
import com.L3CodingRound.entities.User;
import com.L3CodingRound.repository.DeliveryPartnerRepository;
import com.L3CodingRound.repository.OrderDetailsRepository;
import com.L3CodingRound.repository.RestaurantRepository;
import com.L3CodingRound.repository.UserRepository;
import com.L3CodingRound.service.serviceInterface.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceClass implements OrderServiceInterface {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    @Autowired
    private DeliveryPartnerRepository deliveryPartnerRepository;

    @Override
    public String orderItenary(Orderdto orderdto) {
        User user=userRepository.getById(orderdto.getUserId());
        Restaurant restaurant = restaurantRepository.getById(orderdto.getRestaurantId());
        DeliveryPartner deliveryPartner = deliveryPartnerRepository.getById(orderdto.getDeliverPartnerId());
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrderStatus("order Received");
        orderDetails.setUser(user);
        orderDetails.setRestaurant(restaurant);
        orderDetails.setDeliveryPartner(deliveryPartner);
        restaurant.setOrderStatus("accepted");
        orderDetailsRepository.save(orderDetails);
        restaurantRepository.save(restaurant);
        return "order accepted";
    }

    public String updateOrderStatus(Orderdto orderdto){
        Restaurant restaurant = restaurantRepository.findById(orderdto.getRestaurantId()).get();
        restaurant.setOrderStatus("food is prepared");
        OrderDetails orderDetails = orderDetailsRepository.getById(orderdto.getOrderId());
        orderDetails.setOrderStatus("deliveryPartner has reached the restaurant");
        return "order Status Updated";
    }

    public String findingEstimatedTimeOfArrival(Orderdto orderdto){
        Restaurant restaurant = restaurantRepository.findById(orderdto.getRestaurantId()).get();
        User user=userRepository.getById(orderdto.getUserId());
        DeliveryPartner deliveryPartner = deliveryPartnerRepository.getById(orderdto.getDeliverPartnerId());
        double distanceOfDeliveryPartnerToRestaurant=Math.sqrt(Math.pow(
                deliveryPartner.getDeliveryPartnerX_Co_ordinate()-restaurant.getRestaurantX_Co_ordinate(),2)+
                Math.pow(deliveryPartner.getDeliveryPartnerY_Co_ordinate()-restaurant.getRestaurantY_Co_ordinate(),2));

        double distanceOfRestaurantToUser=Math.sqrt(Math.pow(restaurant.getRestaurantX_Co_ordinate()-
                user.getUserX_Co_ordinate(),2)+Math.pow(restaurant.getRestaurantY_Co_ordinate()-
                user.getUserY_Co_ordinate(),2));

        double TotalDistance=distanceOfDeliveryPartnerToRestaurant+distanceOfRestaurantToUser;
        return "distance is calculated";
    }
}
