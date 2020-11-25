package demopackage1;

import java.util.Scanner;

public class HandlingMultipleArraysQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1st array");
		int a=sc.nextInt();
		double[] arr1=new double[a];
		System.out.println("enter the size to the 2nd array");
		int b=sc.nextInt();
		double arr2[]=new double[b];
		System.out.println("enter the elements to the first array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextDouble();
		}
		System.out.println("enter the elements to the second array");
		for(int j=0;j<arr2.length;j++)
		{
			arr2[j]=sc.nextDouble();
		}
		int sum[];
		if(arr1.length>arr2.length)
		{
			 sum=new int[arr1.length];
		}
		else
		{
			sum=new int[arr2.length];
		}
		int c=0;
		for(int i=0;i<(arr1.length)&&(i<arr2.length);i++)
		{
			sum[i]=(int) (arr1[i]+arr2[i]);
			c++;
		}
		if(arr1.length>arr2.length)
		{
			for(int i=c;i<arr1.length;i++)
				 sum[i]=(int)(arr1[i]);
		}
		else {
			for(int i=c;i<arr2.length;i++)
				 sum[i]=(int)(arr2[i]);
		}
		for(int i=0;i<sum.length;i++) {
			System.out.print(sum[i]+" ");
		}
}

	}
