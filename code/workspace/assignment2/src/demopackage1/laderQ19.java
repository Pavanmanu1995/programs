package demopackage1;

import java.util.Scanner;

public class laderQ19 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the array size");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("enter the array elements");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				if (arr[i] <= arr[j]) {
					break;
				}
				else {
					for(j=j+1;j<a;j++)
						if(arr[i]<arr[j])
							break; //this will go to if and execute if and den go to for(i=0;i<a;i++)
						else
							continue;//this will go to for(j=j+1;j<a;j++)
					
				}
				if(j==a)
					System.out.println(arr[i]);
			}
			
		}
		System.out.println(arr[a-1]);
	}
}

