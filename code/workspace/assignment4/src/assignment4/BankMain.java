package assignment4;
import java.util.Scanner;
public class BankMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BankQ3 customer1=new BankQ3(1001,"Kumar","Rajajinagar,Bangalore-10");
		BankQ3 customer2=new BankQ3(1002,"Raja");
		BankQ3 customer3=new BankQ3(100,"Shanthi","Jayanagar,Bangalore-20","SB",1500);
		boolean flag=true;
		do{
			int choice;
			System.out.println("1.to get customer Id,customer Name,customer Address");
			System.out.println("2.to get customer Id,customer Name");
			System.out.println("3.to get customer Id,customer Name,customer Address,account type,account balance");
			System.out.println("4.exit");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("customer Id"+" "+customer1.getCustId());
		        System.out.println("customer Name"+" "+customer1.getCustName());
			    System.out.println("customer Address"+" "+customer1.getCustAddress());
			    break;
			case 2:
				System.out.println("customer Id"+" "+customer2.getCustId());
				System.out.println("customer Name"+" "+customer2.getCustName());
				break;
			case 3:
				System.out.println("customer Id"+" "+customer3.getCustId());
				System.out.println("customer Name"+" "+customer3.getCustName());
				System.out.println("customer Address"+" "+customer3.getCustAddress());
				System.out.println("customer Id"+" "+customer3.getAccType());
				System.out.println("customer Name"+" "+customer3.getCustBalance());
				break;
			case 4:
				flag=false;
				break;
	}
	}while(flag);
		
		/*System.out.println("enter the size of array");
		int size=sc.nextInt();
		BankQ3 customer1=new BankQ3(custId,custName,custAddress);
		BankQ3[] bank=new BankQ3[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the customer id");
			int id=sc.nextInt();
			System.out.println("enter the customer name");
			String name=sc.nextLine();
			System.out.println("enter the customer address");
			String address=sc.nextLine();
			System.out.println("enter the customer account type");
			String type=sc.nextLine();
			System.out.println("enter the customer account balance");
			double balance=sc.nextDouble();
			
		}*/
		
	}

}
