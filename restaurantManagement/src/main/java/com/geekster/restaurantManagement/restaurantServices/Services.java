package com.geekster.restaurantManagement.restaurantServices;

import com.geekster.restaurantManagement.restaurantEntity.Restaurant;
import com.geekster.restaurantManagement.restaurantRepo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Services {

    @Autowired
    RestaurantRepo restaurantRepo;

    public Map<Integer, Restaurant> getMapping(){
        return restaurantRepo.getRestaurantMap();
    }

    public String AddMapping(Restaurant restaurant){
        restaurantRepo.getRestaurantMap().put(restaurant.getRestaurantId(), restaurant);
        return "restaurant Added";

    }
}
