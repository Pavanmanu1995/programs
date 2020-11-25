package javaTrackEngg;

import java.util.Scanner;

public class teamMates {
	public String[] teamMatesName(int size, String array[]) {
		for (int i = 0; i < size; i++) {
			String names = array[i];
		}
		return array;
	}

	public String[] bubblesort(String array[], int size) {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if ((array[j]).compareTo(array[j + 1]) > 0) {
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public String[] insertionSort(String array[], int size) {

		for (int i = 1; i < size; i++) {
			if (i % 2 == 0) {
				String temp = array[i];
				int j = i;
				while (j > 0 && array[j - 1].compareTo(temp) > 1) {
					array[j] = array[j - 1];
					j = j - 1;
				}
				array[j] = temp;
			}
		}
		return array;
	}

	public int positionOfTheName(String array[], int size) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name to find the position");
		String name = sc.nextLine();
		for (int i = 0; i < size; i++) {
			if (array[i] == name) {
				return i;
			}
			return -1;
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		teamMates obj = new teamMates();
		System.out.println("enter the team size");
		int size = sc.nextInt();
		String array[] = new String[size];
		sc.nextLine();
		System.out.println("enter the teammates name");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextLine();
		}
		boolean flag = true;
		do {
			System.out.println("1.teammates name");
			System.out.println("2.bubble sort");
			System.out.println("3.insertion sort");
			System.out.println("4.Search for the position of the names");
			System.out.println("5.exit");
			System.out.println("enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				String names[] = obj.teamMatesName(size, array);
				System.out.println("the names of the team mates are");
				for (int i = 0; i < size; i++) {
					System.out.println(names[i]);
				}
				break;
			case 2:
				String sort[] = obj.bubblesort(array, size);
				for (int i = 0; i < size; i++) {
					System.out.println(sort[i]);
				}
				break;
			case 3:
				String[] insertion = obj.insertionSort(array, size);
				for (int i = 0; i < size; i++) {
					System.out.println(insertion);
				}

				break;
			case 4:
				int position = obj.positionOfTheName(array, size);
				if (position == -1) {
					System.out.println("Element not found");
				} else {
					System.out.println("Element found at " + position);
				}
				break;
			case 5:
				flag = false;
				break;

			}

		} while (flag);

	}
}
