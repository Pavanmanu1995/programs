package assignment3;
import java.util.Scanner;
public class BubbleSortQ1 {
public static int[] bubblesort(int arr[],int n) {
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
	}
	return arr;
			
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
			int[] a=bubblesort(arr,n);
			System.out.println("the sorted array is");
			for(int i=0;i<n;i++) {
				System.out.println(a[i]);
				}
			
}
	}
}


