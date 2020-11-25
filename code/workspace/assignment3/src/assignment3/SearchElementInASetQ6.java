package assignment3;
import java.util.Scanner;
public class SearchElementInASetQ6 {
	
	static Scanner sc=new Scanner(System.in);
	public static void duplicate(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("error");
					System.exit(0);
				}
			}
		}
	}
	public static void searchElements(int arr[],int n)
	{
		System.out.println("enter the number to be searched");
			int key=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	
		if(arr[i]==key)
		{
			int index=i;
			System.out.println(index);
		}
		
	}
	}
	public static void main(String[] args) {
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements to the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		duplicate(arr,n);
		searchElements(arr,n);
		
		

	}

}
