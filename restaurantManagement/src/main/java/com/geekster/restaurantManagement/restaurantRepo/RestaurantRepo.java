package com.geekster.restaurantManagement.restaurantRepo;

import com.geekster.restaurantManagement.restaurantEntity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class RestaurantRepo {
    @Autowired
    private Map<Integer, Restaurant> restaurantMap;

    public Map<Integer,Restaurant> getRestaurantMap()
    {
        return restaurantMap;
    }
}
