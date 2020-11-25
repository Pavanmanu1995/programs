package demopackage1;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);

			}
		}
	}
}