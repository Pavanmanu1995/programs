package com.mindtree.food.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mindtree.food.entity.Food;
import com.mindtree.food.exception.FoodAlreadyPresentException;
import com.mindtree.food.exception.FoodServiceException;
import com.mindtree.food.exception.FoodTypeIsNotPresentException;

public class FoodServiceImplementation implements IFoodService {
	static List<Food> list = new ArrayList<Food>();

	@Override
	public String addFood(Food obj) throws FoodServiceException {
		try {
			for (Food f : list) {
				if (f.getName().equals(obj.getName())) {
					throw new FoodAlreadyPresentException("food already present");
				}
			}
		} catch (FoodServiceException e) {
			throw new FoodServiceException(e.getMessage());
		}
		list.add(obj);
		return "Food is added successfully";
	}

	@Override
	public List<Food> sortFood() {
		List<Food> temp = list;
		IFoodService obj = new FoodServiceImplementation();
		Collections.sort(temp, obj);
		return temp;
	}

	@Override
	public int compare(Food f1, Food f2) {
		if (f1.getPrice() > f2.getPrice()) {
			return 1;
		} else if (f1.getPrice() < f2.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public List<Food> displayFood(String foodType) throws FoodServiceException {
		Food temp = null;
		List<Food> temp1 = new ArrayList<>();

		for (Food f : list) {
			if (f.getType().equals(foodType)) {
				temp = f;
				temp1.add(temp);
			}
		}

		try {
			if (temp == null) {
				throw new FoodTypeIsNotPresentException("food type not found");
			}
		} catch (FoodServiceException e) {
			throw new FoodServiceException(e.getMessage());
		}

		return temp1;
	}

}
