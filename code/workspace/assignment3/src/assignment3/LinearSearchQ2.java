package assignment3;

import java.util.Scanner;

public class LinearSearchQ2 {
	 static Scanner sc=new Scanner(System.in);
	public static boolean linear(int arr[],int n)
	{
		
	System.out.println("enter the number to be searched");
	int num=sc.nextInt();
	boolean a=false;
	for(int i = 0;i<arr.length;i++)
	{
		if(arr[i]==num)
		{
			a=true;
		}
			
		}
	return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements");
		{
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			}
		boolean b=linear(arr,n);
		if(b)
		{       
			System.out.println("TRUE");
		}
		else
			{
			System.out.println("FALSE");
			}
		}
	}
