package demopackage;
import java.util.Scanner;
public class assignment8 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		a=sc.nextInt();
		System.out.println("enter the 2nd number");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("it is invalid");
			
		}
		else if(a<=0 || b<=0)
		{
			System.out.println("it is invalid");
		}
		else
		{
			for(int i=1;i<=10;i++)
			{
				a=a+b;
				b=b+10;
			}
			System.out.println("the value of a is"+a);
			System.out.println("the value of a is"+b);
		}

	}

}
