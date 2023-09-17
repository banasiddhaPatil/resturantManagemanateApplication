package com.geekster.restaurantManagement.restaurantEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private Integer RestaurantId;
    private String RestaurantName;
    private String RestaurantAddress;
    private String  RestaurantNumber;
    private String RestaurantSpecialty;
    private Integer RestaurantTotalStaff;

}
