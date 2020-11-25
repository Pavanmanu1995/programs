package assignment4;

import java.util.Scanner;

public class ShopMain {
	public int intInput(Scanner sc) {
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	public String stringInput(Scanner sc) {
		String input = sc.nextLine();
		sc.nextLine();
		return input;
	}

	public double doubleInput(Scanner sc) {
		double input = sc.nextDouble();
		return input;
	}

	public Shop[] getData(Shop shopArray[], Scanner sc, int i) {
		System.out.println("enter the shop id");
		int id = intInput(sc);
		shopArray[i].setId(id);
		System.out.println("enter the shop name");
		String name = stringInput(sc);
		shopArray[i].setName(name);
		System.out.println("enter the shop revenue");
		double revenue = doubleInput(sc);
		shopArray[i].setRevenue(revenue);
		System.out.println("enter the shop gst number");
		int gst = intInput(sc);
		shopArray[i].setGstNumber(gst);
		return shopArray;

	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int size=sc.nextInt();
	Shop[] shopArray=new Shop[size];
	ShopMain obj=new ShopMain();
	int choice=0,i=0;
	do
	{
		System.out.println("1.add shop");
		System.out.println("2.insertion sort based on gst number");
		System.out.println("3.third highest revenue and difference between highest revenue and third highest");
		System.out.println("4.using binary search for particular shop based on id");
		System.out.println("5.exit");
		System.out.println("enter your choice");
		choice=obj.intInput(sc);
		switch(choice)
		{
		case 1:
			shopArray[i]=new Shop();
			shopArray=obj.getData(shopArray,sc,i);
			i++;
			break;
		case 2:
			for(int a=1;a<i;a++)
			{
				Shop temp=new Shop();
				temp=shopArray[a];
				int j=a;
				while(j>0 && shopArray[j-1].getGstNumber()>temp.getGstNumber())
				{
					shopArray[j]=shopArray[j-1];
					j=j-1;
				}
				shopArray[j]=temp;
			}
			for(int a=0;a<i;a++)
			{
				System.out.println(shopArray[a].toString());
			}
			break;
		case 3:
			for(int a=0;i<i-1;a++)
			{
				for(int j=0;j<i-a-1;j++)
				{
					if(shopArray[j].getRevenue()>shopArray[j+1].getRevenue())
					{
						Shop temp=new Shop();
					temp=shopArray[j];
					shopArray[j]=shopArray[j+1];
					shopArray[j+1]=temp;
					}
				}
			}
			for(int a=0;a<i;a++)
			System.out.println(shopArray[a].toString());
			System.out.println("the third hightest element is");
			System.out.println((shopArray[i-3].toString()));
			System.out.println("the difference between hightest and third highest element is");
			System.out.println((shopArray[i].getRevenue())-(shopArray[i-3].getRevenue()));
			break;
		case 4:
			System.out.println("enter the shop id to find");
			int id=obj.intInput(sc);
			int first = 0;
			int last = shopArray.length - 1;
			int mid = (first + last) / 2;
			while (first <= last) 
			{
				if (shopArray[mid].getId() == id) 
				{
					System.out.println(shopArray[mid].getName());
					break;
				}
				else if (shopArray[mid].getId() < id)
				{
				first = mid + 1;
				} 
				else 
				{
				last = mid - 1;
				}
				mid = (first + last) / 2;
				}
			break;
		
		case 5:
			System.out.println("exit");
			break;
			
			}
		}
	while(choice!=5);

	}

}
