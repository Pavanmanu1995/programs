package assignment4;
import java.util.Scanner;
public class coffeeShopMain {
	static void print(customer[] obj,int n)
	{
		for(int i=0;i<)
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		coffeeShop[] shop=new coffeeShop[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the customer name");
			String name=sc.nextLine();
			System.out.println("enter the customer mob number");
			String mobNumber=sc.nextLine();
			System.out.println("enter rating from 0 to 5");
			double rating=sc.nextDouble();
			if(rating>=0 && rating<=5)
			{
				double feedback=rating;
			}
			else
			{
				System.out.println("please enter the correct rating");
			}
			customer cust=new customer
		}

	}

}
