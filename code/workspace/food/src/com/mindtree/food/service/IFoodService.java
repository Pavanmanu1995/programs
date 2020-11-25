package com.mindtree.food.service;

import java.util.Comparator;
import java.util.List;

import com.mindtree.food.entity.Food;
import com.mindtree.food.exception.FoodServiceException;
//public interface IFoodService
public interface IFoodService extends Comparator<Food>{
	public String addFood(Food obj) throws FoodServiceException;
	
	public List<Food> sortFood();
	
	public List<Food> displayFood(String foodType) throws FoodServiceException;

}
