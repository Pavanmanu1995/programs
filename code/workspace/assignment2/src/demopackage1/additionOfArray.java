package demopackage1;
import java.util.Scanner;

public class additionOfArray {
	static Scanner sc=new Scanner(System.in);
	static int add(int arr[])
	{
		int sum=0;
		System.out.println("enter the elements to the array");
		{
			for(int i=0;i<arr.length;i++)
			{
		arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
			return sum;
	}
	}

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		int n=sc.nextInt();
	int arr[]=new int[n];
	int result=add(arr);
	System.out.println(result);
	
	}
}

