package demopackage1;
import java.util.Scanner;
public class uniqueElementsQ13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		
		System.out.println("enter the size of 1st array");
		int a=sc.nextInt();
		
		int[] arr1=new int[a];
		
		System.out.println("enter the size of 2st array");
		int b=sc.nextInt();
		
		int arr2[]=new int[b];
		
		System.out.println("enter the values a 1st array");
		for(i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the elements to the array 2");
			for(j=0;j<b;j++)
			{
				arr2[j]=sc.nextInt();
			}
			
		
		for(i=0;i<a;i++)
		{
			boolean temp=false;
			
			for(j=0;j<b;j++)
			{
				
				if(arr1[i]==arr2[j])
				{
					temp=true;
				}
			}
			if(!temp)
			{
				
					System.out.println(arr1[i]);
			}
		}
			
		for(i=0;i<b;i++)
		{
			boolean temp=false;
			
			for(j=0;j<a;j++)
			{
				
				if(arr2[i]==arr1[j])
				{
					temp=true;
				}
			}
			if(!temp)
			{
				
					System.out.println(arr2[i]);
			}
		}
	}
}
