package demopackage1;
import java.util.Scanner;
public class assignment1 {

	public static void main(String[] args) {
		int arr[]= new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("the sum of elements in the array is"+sum);
	}

	}

