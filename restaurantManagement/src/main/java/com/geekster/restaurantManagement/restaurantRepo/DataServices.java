package com.geekster.restaurantManagement.restaurantRepo;
import com.geekster.restaurantManagement.restaurantEntity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class DataServices {
    @Bean
    HashMap<Integer,Restaurant> restaurantHashMap()
    {
        return new HashMap<>();
    }
}
