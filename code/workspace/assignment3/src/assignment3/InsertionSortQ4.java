package assignment3;
import java.util.Scanner;
public class InsertionSortQ4 {
public static int[] insert(Scanner sc) 
{
	System.out.println("enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("eneter the elements to the array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	return arr;
}
public static int[] insertionSort(int arr[],int n)
{
	for(int i=1;i<n;i++)
	{
		int temp=arr[i];
		int j=i;
		while(j>0 && arr[j-1]>temp)
		{
			arr[j]=arr[j-1];
			j=j-1;
		}
		arr[j]=temp;
	}
	return arr;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=insert(sc);
		int n=arr.length;
		int sorted[]=insertionSort(arr,n);
		System.out.println("the sorted array is");
		for(int i=0;i<n;i++)
		{
			System.out.println(sorted[i]);
		}
		


	}

}
