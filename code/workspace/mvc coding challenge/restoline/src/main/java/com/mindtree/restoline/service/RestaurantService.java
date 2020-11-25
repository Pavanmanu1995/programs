package com.mindtree.restoline.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.restoline.entity.Restaurant;
import com.mindtree.restoline.exception.service.RestoLineServiceException;

@Service
public interface RestaurantService {


	Restaurant addRestaurant(Restaurant restaurant) throws RestoLineServiceException;

	Set<Restaurant> getAllRestaurant();

}
