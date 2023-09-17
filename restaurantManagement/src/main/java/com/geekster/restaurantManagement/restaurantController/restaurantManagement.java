package com.geekster.restaurantManagement.restaurantController;

import com.geekster.restaurantManagement.restaurantEntity.Restaurant;
import com.geekster.restaurantManagement.restaurantServices.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class restaurantManagement {


    @Autowired
    Services services;
     @GetMapping("get/restaurant")
    public Map<Integer, Restaurant> getMapping(){
          return services.getMapping();
    }

    @PostMapping("post/resturant")
    public String addRestaurant(@RequestBody Restaurant restaurant)
    {
       return  services.AddMapping(restaurant);
    }
}
