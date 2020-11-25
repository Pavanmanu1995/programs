package zeroToLast;
import java.util.Scanner;
public class demo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int array1[] = new int[size];
		System.out.println("enter the elements to the array");
		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
		}
		//System.out.println("enter the key to be found");
		//int key = sc.nextInt();
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array1[j] > array1[j + 1]) {
					int temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
	}

}
}
		for(int i=0;i<size;i++)
		System.out.println(array1[i]);
	}
}