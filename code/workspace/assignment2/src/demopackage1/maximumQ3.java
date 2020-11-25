package demopackage1;
import java.util.Scanner;
public class maximumQ3 {
	static void getMax(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("the greatest number is "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("the greatest number is "+b);
		}
		else 
		{
			System.out.println("the greatest number is "+c);
		}
	}

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a;
int b;
int c;
System.out.println("enter the value of a");
a=sc.nextInt();
System.out.println("enter the value of b");
b=sc.nextInt();
System.out.println("enter the value of c");
c=sc.nextInt();
getMax(a,b,c);
	}

}
