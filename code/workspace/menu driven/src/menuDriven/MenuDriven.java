package menuDriven;

import java.util.Scanner;

public class MenuDriven {
	static Scanner sc = new Scanner(System.in);

	public int positinOfTheElements(int array[], int n) {
		System.out.println("enter the element to find the position of the that element");
		int number = sc.nextInt();
		//System.out.println("the number is found at");
		for (int i = 0; i < n; i++) {
			if (array[i] == number) {
				return i;
			}
			return -1;
			
		}
		System.out.println("it is not found");
		return 0;
		
		
	}
	public int IndexOfTheElements(int array1[], int key,int size) {
		
		//int num= sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (array1[i] ==key) {
				return i;
			}
		}
		return 0;
	}

	public int[] bubblesortForInteger(int array1[], int size) {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array1[j] > array1[j + 1]) {
					int temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}
		return array1;
	}
	public int[] bubblesortForStrings(int array2[], int size) {
		for (int j= 0; j < size; j++) {
			for (int i= j+1; i< size; i++) {
				if ((array2[i]).compareTo(array2[j])>0)) {
					int temp = array2[j];
					array2[j] = array2[j + 1];
					array2[j + 1] = temp;
				}
			}
		}
		return array2;
	}


	public boolean binarySearchOfInteger(int array1[], int key) {
		int first = 0;
		int last = array1.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (array1[mid] == key) {
				return true;
			} else if (array1[mid] < key) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return false;
	}

	public boolean binarySearchOfstrings(String array2[], int size1, String word) {
		int first = 0;
		int last = array2.length - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (array2[mid].compareTo(word) == 0) {
				return true;
			}

			else if (array2[mid].compareTo(word) < 0) {
				first = mid + 1;
			} else {
				last = mid - 1;

			}
			mid = (first + last) / 2;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		MenuDriven obj = new MenuDriven();
		boolean flag = true;
		do {
			System.out.println("1.Position of a given elements");
			System.out.println("2.binary search of the elements");
			System.out.println("3.binary search for a string");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the size of the array");
				int n = sc.nextInt();
				int array[] = new int[n];
				System.out.println("enter the elements to the array");
				for (int i = 0; i < n; i++) {
					array[i] = sc.nextInt();
				}
				

				int position = obj.positinOfTheElements(array, n);
				if(position==-1) {
					System.out.println("Element not found");
				}
				else {
					System.out.println("Element found at "+position);
				}

				break;
			case 2:
				System.out.println("enter the size of the array");
				int size = sc.nextInt();
				int array1[] = new int[size];
				System.out.println("enter the elements to the array");
				for (int i = 0; i < size; i++) {
					array1[i] = sc.nextInt();
				}
				System.out.println("enter the key to be found");
				int key = sc.nextInt();
				int[] temp = obj.bubblesortForInteger(array1, size);
				for(int i=0;i<size;i++)
				System.out.println(array1[i]);
				int index=obj.IndexOfTheElements(array1,key,size);
				System.out.println(index);
				
				boolean a = obj.binarySearchOfInteger(temp, key);
				if (a) {
					System.out.println("true" + " " + "the key is found");
				} else {
					System.out.println("false" + " " + "the key is not found");
				}
				break;
			case 3:
				System.out.println("enter the string to the array");
				String str=sc.nextLine();
				sc.nextLine();
				int size1=str.length();
				String array2[]=new String[size1];
				for(int i=0;i<size1;i++)
				{
					array2[i]=sc.nextLine();
				}
				System.out.println("enter the word to be found");
				String word = sc.nextLine();
				boolean b = obj.binarySearchOfstrings(array2,size1, word);
				if (b) {
					System.out.println("false" + " " + "the word not found");
				} else {
					System.out.println("true" + " " + "the word is found");
				}

				break;
			case 4:
				flag = false;
				System.out.println("exited");
				break;

			}
//			sc.close();
		} while (flag);
	}

}
