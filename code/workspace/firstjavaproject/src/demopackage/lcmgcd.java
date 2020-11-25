package demopackage;
import java.util.Scanner;
public class lcmgcd {
	static void demo(int a,int b)
	{
		int lcm=0;
		int gcd=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
		lcm=(a*b)/gcd;
		System.out.println(lcm);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		demo(a,b);
		
	}

}
