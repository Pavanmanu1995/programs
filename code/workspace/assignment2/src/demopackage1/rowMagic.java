package demopackage1;

import java.util.Scanner;

public class rowMagic {
	public static boolean magicRow(int arr[][], int m, int n) {

		int sum = 0;
		int temp[] = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum = sum + arr[i][j];

			}
			System.out.println(sum);
			temp[i] = sum;
			sum = 0;
		}
		boolean flag = true;
		for (int i = 0; i < temp.length; i++) {
			if (temp[0] == temp[i]) {
				continue;
			} else {
				flag = false;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the row");
		int n = sc.nextInt();
		System.out.println("enter the size of the columns");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		boolean c = magicRow(arr, m, n);

		if (c) {
			System.out.println("it is row magic");
		} else
			System.out.println("it is not a row magic");

	}
}
