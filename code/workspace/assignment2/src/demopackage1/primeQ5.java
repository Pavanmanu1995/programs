package demopackage1;
import java.util.Scanner;
public class primeQ5 {
 static boolean isPrime(int num){
	for(int i=2;i<=(num/2);i++)
	{
		if(num%i==0)
		{
			return false;
		}
	}
		return true;
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("enter the number");
		int num=sc.nextInt();
		boolean r=isPrime(num);
		System.out.println(r);
	}

}

