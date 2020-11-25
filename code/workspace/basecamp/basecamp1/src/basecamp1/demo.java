package basecamp1;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	double num=0;
		System.out.println("enter the number");
		num=sc.nextDouble();
		System.out.println("the entered number is"+num);
		while(num>=10)
		{
		 num=num/10;
		System.out.println("the first number is"+(int)num);
		}
		if(num<=0)
		{
			System.out.println("invalid");
		}
		

	}

}
