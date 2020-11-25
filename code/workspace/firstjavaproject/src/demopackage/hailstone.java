package demopackage;
import java.util.Scanner;
public class hailstone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the positive number");
		int n=sc.nextInt();
		int c=0;
		while(n!=1)
		{
		if(n%2==0)
		{
			 n=n/2;
			System.out.println(n+"is even so i take half:"+n);
			c++;
			
		}
		else
		{
			 n=(n*3)+1;
			System.out.println(n+"is odd so i make 3n+1:"+n);
			c++;
		}
		
		}
		System.out.println("there are total"+c+"steps to reach 1");
	}

}
