package assignment3;

import java.util.Scanner;

public class SortAndSearchQ5 {
	static Scanner sc = new Scanner(System.in);

	public static int[] bubbleSort(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] insertionSort(int sort[], int m) {
		for (int i = 1; i < m; i++) {
			int temp = sort[i];
			int j = i;
			while (j > 0 && sort[j - 1] > temp) {
				sort[j] = sort[j - 1];
				j = j - 1;
			}
			sort[j] = temp;
		}
		return sort;

	}

	public static boolean binarySearch(String string[], int size, String str) {
		int first = 0;
		int last = string.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (string[mid].compareTo(str) == 0) {
				return true;
			} else if (string[mid].compareTo(str) < 0) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return false;
	}

public static void main(String[] args) {
	boolean flag=true;
	do
	{
System.out.println("1.Sort using Bubble sort");
System.out.println("2.Sort using Insertion sort");
System.out.println("3.Search a string");
System.out.println("4.Exit");
System.out.println("enter the choice");
int choice=sc.nextInt();
switch(choice)
{
case 1:
	System.out.println("enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the arry elements to be sorted");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int arr1[]=bubbleSort(arr,n);
	System.out.println("the sorted array is"+" ");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
	
	break;
case 2:
	System.out.println("enter the size of the array");
	int m=sc.nextInt();
	int sort[]=new int[m];
	System.out.println("enter the arry elements to be sorted");
	for(int i=0;i<m;i++)
	{
		sort[i]=sc.nextInt();
	}
	int arr2[]=insertionSort(sort,m);
	System.out.println("the sorted array is"+" ");
	for(int i=0;i<m;i++)
	{
		System.out.println(sort[i]);
	}
	break;
case 3:
	System.out.println("enter the size of the array string");
	int size=sc.nextInt();
	String string[]=new String[size];
	System.out.println("enter the string");
	for(int i=0;i<size;i++)
	{
		string[i]=sc.nextLine();
	}
	sc.nextLine();
	System.out.println("enter the string to be searched");
	String str=sc.nextLine();
boolean a=binarySearch(string,size,str);
if(a)
{
	System.out.println("true");
}

	else
	{
		System.out.println("false");
}
	break;	
case 4:
	flag=false;
	break;
}
	}
	while(flag);
	}
}
