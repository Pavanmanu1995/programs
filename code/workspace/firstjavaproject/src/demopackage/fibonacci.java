package demopackage;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fib;
		int n1=0;
		int n2=1;
		System.out.println("enter the number");
		fib=sc.nextInt();
		for(int i=1;i<=fib;i++)
		{
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
			
		}
		
		
	

	}

}
