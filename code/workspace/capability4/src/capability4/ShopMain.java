package capability4;
import java.util.Scanner;
public class ShopMain {
	public int intInput(Scanner sc)
	{
		int input=sc.nextInt();
		sc.nextLine();
		return input;
	}
	public double doubleInput(Scanner sc)
	{
		double input=sc.nextDouble();
		sc.nextLine();
		return input;
	}
	public String stringInput(Scanner sc)
	{
		String input=sc.nextLine();
		return input;
	}
	public Shop[] getData(Shop[] shopArray,int i,Scanner sc)
	{
		System.out.println("enter the shop id");
		int id=intInput(sc);
		shopArray[i].setId(id);
		
		System.out.println("enter the shop name");
		String name=stringInput(sc);
		shopArray[i].setName(name);
		
		System.out.println("enter the shop revenue");
		double revenue=doubleInput(sc);
		shopArray[i].setRevenue(revenue);
		
		System.out.println("enter the shop gst number");
		int gstNumber=intInput(sc);
		shopArray[i].setGstNumber(gstNumber);
		return shopArray;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shop[] shopArray=new Shop[10];
		ShopMain obj=new ShopMain();
		int choice=0,i=0;
		do
		{
			System.out.println("1.add shop");
			System.out.println("2.insertion sort based on gstNumber");
			System.out.println("3.display the shop 3rd highest revenue and difference between highest and 3rd highest revenue");
			System.out.println("4.binary search to find the shop on id");
			System.out.println("5.exit");
			System.out.println("Enter your choice");
			choice=obj.intInput(sc);
			switch(choice)
			{
			case 1:
				shopArray[i]=new Shop();
				shopArray=obj.getData(shopArray, i, sc);
				i++;
				break;
			case 2:
			for(int a=1;a<i;a++)
			{
				int j=a;
				Shop key=new Shop();
				key=shopArray[a];
				while(j>0 && (shopArray[j-1].getGstNumber()>key.getGstNumber()))
				{
					shopArray[j]=shopArray[j-1];
					j--;
				}
				shopArray[j]=key;
				}
			for(int a=0;a<i;a++)
			{
				System.out.println(shopArray[a].toString());
			}
			break;
			case 3:
				for(int j=0;j<i;j++)
				{
					for(int k=0;k<(i-1);k++)
					{
						if(shopArray[k].getRevenue()>shopArray[k+1].getRevenue())
						{
							Shop temp=new Shop();
							temp=shopArray[k];
							shopArray[k]=shopArray[k+1];
							shopArray[k+1]=temp;
						}
					}
				}
					for(int a=0;a<i;a++)
					{
						System.out.println(shopArray[a].toString());
					}
					System.out.println("third highest element is");
					System.out.println(shopArray[i-3].toString());
					double heighest=((shopArray[i-1].getRevenue())-shopArray[i-3].getRevenue());
					System.out.println(heighest);
					break;
			case 4:
				boolean flag=true;
				System.out.println("enter the shop id to search");
				int id=obj.intInput(sc);
				for(int a=0;a<i;a++)
				{
					if(shopArray[a].getId()==id)
					{
						System.out.println(shopArray[a].getName());
						flag=false;
					}
					if(flag)
					{
						System.out.println("element not found");
					}
				}
						break;
						case 5:
							System.out.println("invalid input");
			}
			}
		while(choice!=5);
					}
				}