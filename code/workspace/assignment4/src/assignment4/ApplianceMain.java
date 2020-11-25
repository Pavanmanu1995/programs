package assignment4;

import java.util.Scanner;

public class ApplianceMain {
	public int intInput(Scanner sc)
	{
		int input=sc.nextInt();
		sc.nextLine();
		return input;
	}
	
	public String stringInput(Scanner sc)
	{
		String input=sc.nextLine();
		return input;
	}
	
	public double doubleInput(Scanner sc)
	{
		double input=sc.nextDouble();
		return input;
	}
	
	public Appliance[] getData(Appliance[] applianceArray,int i,Scanner sc)
	{
		System.out.println("enter the appliance id");
		int id=intInput(sc);
		applianceArray[i].setApplianceId(id);
		
		System.out.println("enter the appliance name");
		String name=stringInput(sc);
		applianceArray[i].setApplianceName(name);
		
		System.out.println("enter the appliance price");
		double price=doubleInput(sc);
		applianceArray[i].setPrice(price);
		
		return applianceArray;
		}
	
	public Appliance[] insertionSort(Appliance[] applianceArray,int i)
	{
		for(int a=1;a<i;a++)
		{
			Appliance temp=new Appliance();
			temp=applianceArray[a];
			int j=a;
			while(j>0 && applianceArray[j-1].getPrice()>temp.getPrice())
			{
				applianceArray[j]=applianceArray[j-1];
				j=j-1;
			}
			applianceArray[j]=temp;
		}
		return applianceArray;
	}
	
	public Appliance display(Appliance[] applianceArray,int i)
	{
		Appliance a=null;
		for(int c=0;c<i;c++)
		{
			if(applianceArray[c].getApplianceName().charAt(0)=='a')
			{
				a=applianceArray[c];
			}
		}
		
		return a;
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplianceMain obj=new ApplianceMain();
		System.out.println("enter the size of the array");
		int size=obj.intInput(sc);
		Appliance[] applianceArray=new Appliance[size];
		int choice=0,i=0;
		do
		{
			System.out.println("1.add appliance");
			System.out.println("2.Sort based on price");
			System.out.println("3.Display appliance starting with 'a'");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			choice=obj.intInput(sc);
			switch(choice)
			{
			case 1:
				applianceArray[i]=new Appliance();
				applianceArray=obj.getData(applianceArray, i, sc);
				i++;
				for(int b=0;b<i;b++)
				System.out.println(applianceArray[b].toString());
				break;
			case 2:
				applianceArray=obj.insertionSort(applianceArray, i);
				for(int b=0;b<i;b++)
					System.out.println(applianceArray[b].toString());
				break;
			case 3:
				Appliance app=obj.display(applianceArray, i);
				System.out.println(app.toString());
				break;
			case 4:
				System.out.println("exit");
				break;
				
				
			}
			
		}
		while(choice!=4);
		
	}
		

}
