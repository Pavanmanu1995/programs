package demopackage;
import java.util.Scanner;
public class multipication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		for(int i=1;i<=12;i++)
		{
			int result=n*i;
			System.out.println(result);
			
		}


	}

}
