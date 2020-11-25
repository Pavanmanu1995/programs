package assignment3;

import java.util.Scanner;

public class BinarySearch {
	Scanner sc = new Scanner(System.in);
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

	public static Boolean findElement(int arr[], int key) {
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] == key) {
				return true;
			}
			else if (arr[mid] < key) {
			first = mid + 1;
		} else {
			last = mid - 1;
		}
		mid = (first + last) / 2;
		}
		return false;
	}
	public static Boolean findString(String names[], String name) {
		int first = 0;
		int last = names.length - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (names[mid].compareTo(name) == 0) {
				return true;
			}

			else if (names[mid].compareTo(name) < 0) {
				first = mid + 1;
			} else {
				last = mid - 1;

			}
			mid = (first + last) / 2;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("1.binary search for integer");
			System.out.println("2.binary search for strings");
			System.out.println("3.exit");
			System.out.println("enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the size of array");
				int n = sc.nextInt();
				int arr[] = new int[n];
				System.out.println("enter the array");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				System.out.println("enter the value need to found");
				int key = sc.nextInt();
				int[] temp=bubblesort(arr,n);
				boolean b = findElement(temp, key);
				if (b) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}

				break;
			case 2:
				System.out.println("enter the size of the array");
				int m = sc.nextInt();
				String names[] = new String[m];
				System.out.println("enter the string array");
				for (int i = 0; i < m; i++) {
					names[i] = sc.next();
				}
				sc.nextLine();
				System.out.println("enter the string need to found");
				String name = sc.nextLine();

				boolean y = findString(names, name);
				if (y) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}

				break;
			case 3:
				flag = false;
				break;
			}
		} while (flag);

	}
}
