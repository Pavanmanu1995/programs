package demopackage1;
import java.util.Scanner;
public class sample {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	sc.nextLine();
	System.out.println("enter the name");
	String name=sc.nextLine();
	System.out.println("enter the mark");
	int marks=sc.nextInt();
	System.out.println("enter the city");
	sc.nextLine();
	String city=sc.nextLine();
	System.out.println(age+" "+name+" "+marks+" "+city);
	
	
	
	}
}
