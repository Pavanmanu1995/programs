package demopackage;
import java.util.Scanner;

public class positiveinteger11 {

	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the positive integer");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("the entered integer is a positive");
			
		}
		else
		{
			System.out.println("the entered integer is negative");
		}
		while(num!=0)
		{
			num=num/10;
					c++;
		}
		
		System.out.println("the count of positive integers is"+c);
		

	}

}
