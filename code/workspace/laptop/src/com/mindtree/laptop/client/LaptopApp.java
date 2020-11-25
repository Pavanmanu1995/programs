package com.mindtree.laptop.client;

import java.util.List;

import com.mindtree.exception.LaptopServiceException;
import com.mindtree.laptop.entity.Laptop;
import com.mindtree.laptop.utility.Initalize;
import com.mindtree.service.ILaptopService;
import com.mindtree.service.LaptopServiceImplementation;

public class LaptopApp {
	static Initalize in=new Initalize();
	static ILaptopService service=new LaptopServiceImplementation();
	public static void main(String[] args) {
		boolean flag=true;
		do
		{
			System.out.println("1.Add laptop");
			System.out.println("2.comparator/comparable to get all laptop based on price");
			System.out.println("3.get all laptop of perticular model");
			System.out.println("4.display all the brands having more than 3 laptops");
			System.out.println("5.fetch all laptop details and store it in .txt file");
			System.out.println("6.exit");
			System.out.println("enter your choice");
			int choice=in.intInput();
			switch(choice)
			{
			case 1:
				System.out.println("enter the laptop serialNumber");
				int serialNumber=in.intInput();
				System.out.println("enter the laptop price");
				double price=in.doubleInput();
				System.out.println("enter the laptop model");
				String model=in.stringInput();
				System.out.println("enter the brand of laptop");
				String brand=in.stringInput();
				Laptop lap=new Laptop(serialNumber,price,model,brand);
				try
				{
					String mess=service.addLaptop(lap);
					System.out.println(mess);
				}
				catch(LaptopServiceException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				List<Laptop> sortedList=service.sortLaptop();
				System.out.println(sortedList.toString());
				break;
			case 3:
				System.out.println("enter the laptop model");
				String model1=in.stringInput();
				try
				{
					List<Laptop> mess=service.displayLaptop(model1);
					System.out.println(mess);
					}
				catch(LaptopServiceException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				flag=false;
				break;
				
				
			}
			
		}
		while(flag);

	}

}
