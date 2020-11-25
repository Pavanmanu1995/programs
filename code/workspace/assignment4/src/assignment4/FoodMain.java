package assignment4;

import java.util.Scanner;

public class FoodMain {
	public int intInput(Scanner sc) {
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	public String stringInput(Scanner sc) {
		String input = sc.nextLine();
		return input;
	}

	public double doubleInput(Scanner sc) {
		double input = sc.nextDouble();
		sc.nextLine();
		return input;
	}

	public Food[] getData(Food[] foodArray,int i,Scanner sc)
	{
		System.out.println("enter the food id");
		int id=intInput(sc);
		foodArray[i].setId(id);
		
		System.out.println("enter the food name");
		String name=stringInput(sc);
		foodArray[i].setName(name);
		
		System.out.println("enter the food price");
		double price=doubleInput(sc);
		foodArray[i].setPrice(price);
		
		System.out.println("enter the type of food");
		String type=stringInput(sc);
		foodArray[i].setType(type);
		
		return foodArray;
	}
	
	public Food[] insertionSort(Food[] foodArray,int i)
	{
		for(int a=1;a<i;a++)
		{
			int j=a;
			Food temp=new Food();
			temp=foodArray[a];
			while(j>0 && foodArray[j-1].getPrice()>temp.getPrice())
			{
				foodArray[j]=foodArray[j-1];
				j--;
			}
			foodArray[j]=temp;
		}
		return foodArray;
	}
	
	public Food displayFood(Food[] foodArray,int i,Scanner sc)
	{
		System.out.println("enter the food name");
		String name=stringInput(sc);
		Food currFood=null;
		for(int b=0;b<i;b++)
		{
			if(foodArray[b].getName().equalsIgnoreCase(name))
			{
				currFood=foodArray[b];
			}
			
		}
		if(currFood==null) {
			System.out.println("Food not found");
		}
		return currFood;
	}
	
	public Food[] bubblesort(Food[] foodArray,int i) {
		for(int b=0;b<i-1;b++)
		{
			for(int j=0;j<i-b-1;j++)
			{
				if(foodArray[j].getId()>foodArray[j+1].getId())
				{
					Food temp=new Food();
				 temp=foodArray[j];
				foodArray[j]=foodArray[j+1];
				foodArray[j+1]=temp;
				}
			}
		}
		return foodArray;
	}
	public Food[] binarySearch(Food[] foodArray,int i,int id)
	{
	int first = 0;
	int last = foodArray.length - 1;
	int mid = (first + last) / 2;
	while (first <= last) {
		if (foodArray[mid].getId() == id) {
			System.out.println(foodArray[mid].getName());
			break;
		}
		else if (foodArray[mid].getId() < id) {
		first = mid + 1;
	} else {
		last = mid - 1;
	}
	mid = (first + last) / 2;
	}
	return foodArray;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FoodMain obj=new FoodMain();
		System.out.println("enter the size of the array");
		int size=obj.intInput(sc);
		Food[] foodArray=new Food[size];
		int choice=0,i=0;
		
		do
		{
			System.out.println("1.Add Food");
			System.out.println("2.Insertion sort based on food price");
			System.out.println("3.Display all the food");
			System.out.println("4.Binary search based on food id");
			System.out.println("5.exit");
			System.out.println("enter your choice");
			choice=obj.intInput(sc);
			switch(choice)
			{
			case 1:
				foodArray[i]=new Food();
				foodArray=obj.getData(foodArray,i,sc);
				i++;
				for(int b=0;b<i;b++)
				System.out.println(foodArray[b].toString());
				break;
			case 2:
				foodArray=obj.insertionSort(foodArray,i);
				for(int b=0;b<i;b++)
					System.out.println(foodArray[b].toString());
				break;
			case 3:
				Food food=obj.displayFood(foodArray, i, sc);
				System.out.println(food.toString());
				break;
			case 4:
				foodArray=obj.bubblesort(foodArray,i);
				for(int f=0;f<i;f++)
				{
					System.out.println(foodArray[f].toString());
				}
				System.out.println("enter the id to search");
				int id=obj.intInput(sc);
				foodArray=obj.binarySearch(foodArray,i,id);
				System.out.println(foodArray.toString());
				break;
			case 5:
				System.out.println("exit");
				break;
				
			}
			
		}
		while(choice!=5);

	}

}
