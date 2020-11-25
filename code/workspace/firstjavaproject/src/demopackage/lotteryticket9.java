package demopackage;
import java.util.Scanner;
public class lotteryticket9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the value of a");
		int a= sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("enter the value of c");
		int c=sc.nextInt();
		if(a!=b && a!=c && b!=c)
		{
			System.out.println("0");
		}
		if(a==b && a==c && b==c)
		{
			System.out.println("20");
		}
		else if(a==b || a==b || a==c || b==c)
		{
			System.out.println("10");
		}
		
			

	}

}
