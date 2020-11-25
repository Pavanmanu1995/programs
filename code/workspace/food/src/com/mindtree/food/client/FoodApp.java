package com.mindtree.food.client;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.food.entity.Food;
import com.mindtree.food.exception.FoodServiceException;
import com.mindtree.food.service.FoodServiceImplementation;
import com.mindtree.food.service.IFoodService;
import com.mindtree.food.utility.Initialize;

public class FoodApp {
	static Initialize in=new Initialize();
	static IFoodService service=new FoodServiceImplementation();

	public static void main(String[] args) {
		boolean flag=true;
		do
		{
			System.out.println("1.Add food");
			System.out.println("2.using comparator/comparable sort food based on price");
			System.out.println("3.display all food of perticular type throw exception if that food is not present");
			System.out.println("4.return all food in .txt file");
			System.out.println("5.exit");
			System.out.println("enter your choice");
			int choice=in.intInput();
			switch(choice)
			{
			case 1:
				System.out.println("enter the food id");
				int id=in.intInput();
				System.out.println("enter the food name");
				String name=in.stringInput();
				System.out.println("enter the price of the food");
				double price=in.doubleInput();
				System.out.println("enter the type of the food");
				String type=in.stringInput();
				Food obj=new Food(id,name,price,type);
				try
				{
					String mess=service.addFood(obj);
					System.out.println(mess);
					}
				catch(FoodServiceException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				List<Food> sortedList=service.sortFood();
				System.out.println(sortedList.toString());
				break;
			case 3:
				System.out.println("enter the type of food");
				String foodType=in.stringInput();
				try
				{
					List<Food> mess=service.displayFood(foodType);
					System.out.println(mess);
					}
				catch(FoodServiceException e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
			case 4:
				break;
			case 5:
				flag=false;
				break;
				
			}
			}
		while(flag);
			
		}
		
		

	}

