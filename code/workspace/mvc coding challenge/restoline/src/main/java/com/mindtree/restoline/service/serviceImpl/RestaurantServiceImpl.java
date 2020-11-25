package com.mindtree.restoline.service.serviceImpl;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.restoline.entity.Restaurant;
import com.mindtree.restoline.exception.service.RestoLineServiceException;
import com.mindtree.restoline.exception.service.custom.RestaurantAlreadyPresentException;
import com.mindtree.restoline.repository.RestaurantRepository;
import com.mindtree.restoline.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) throws RestoLineServiceException {

		if (restaurantRepository.findByRestaurantName(restaurant.getRestaurantName()).isPresent())
			throw new RestaurantAlreadyPresentException("Restuarnt Already Exits");

		return restaurantRepository.save(restaurant);

	}

	@Override
	public Set<Restaurant> getAllRestaurant() {

		return new TreeSet<Restaurant>(restaurantRepository.findAll());
	}

}

