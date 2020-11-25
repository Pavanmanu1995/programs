package assignment4;
import java.util.Scanner;
public class SavingsAccountMain {
	public void withDraw(double amount,double balance)
	{
		if(amount>balance)
		{
			System.out.println("error insuficient balance");
		}
		else
		{
			balance=balance-amount;
			System.out.println("sucessfully withdrawn"+balance);
			System.out.println("the available balance is"+" "+balance);
		}
	}
	public void calculateInterest(double balance,int time,int rate)
	{
		double SI=0;
		SI=(balance*time*rate)/100;
		System.out.println("simple interest is"+" "+SI);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SavingsAccountMain obj=new SavingsAccountMain();
		System.out.println("enter the account number");
		int accountNo=sc.nextInt();
		System.out.println("enter the balance");
		double balance=sc.nextDouble();
		boolean flag=true;
		do
		{
			
			System.out.println("1.enter 1 to with draw");
			System.out.println("2.enter 2 to calculate rate of interest");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the amount to be withdrawn");
				double amount=sc.nextDouble();
			obj.withDraw(amount,balance);
			break;
			case 2:
				System.out.println("enter the time");
				int time=sc.nextInt();
				System.out.println("enter the rate of interset");
				int rate=sc.nextInt();
				obj.calculateInterest(balance,time,rate);
				break;
			case 3:
				flag=false;
			
		}
	}
		while(flag);

}
}

