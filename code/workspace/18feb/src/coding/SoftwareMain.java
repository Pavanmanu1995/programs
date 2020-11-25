package coding;

import java.util.Scanner;

public class SoftwareMain {
	public int intInput(Scanner sc) {
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	public String stringInput(Scanner sc) {
		String input = sc.nextLine();
		return input;
	}

	public double doubleInput(Scanner sc) {
		double input = sc.nextDouble();
		return input;
	}

	public Software[] getData(Software[] softwareArray, int i, Scanner sc) {
			
		System.out.println("enter the software id");
		int id = intInput(sc);
		softwareArray[i].setId(id);

		System.out.println("enter the license number");
		int licenseNumber = intInput(sc);
		softwareArray[i].setLicenseNumber(licenseNumber);

		System.out.println("enter the software name");
		String name = stringInput(sc);
		softwareArray[i].setName(name);

		System.out.println("enter the software cost");
		double cost = doubleInput(sc);
		softwareArray[i].setCost(cost);
		return softwareArray;

	}
	

	public Software[] insertionSort(Software[] softwareArray, int i) {
		for (int a = 1; a < i; a++) {
			int j = a;
			Software temp = new Software();
			temp = softwareArray[a];
			while (j > 0 && softwareArray[j - 1].getCost() > temp.getCost()) {
				softwareArray[j] = softwareArray[j - 1];
				j--;
			}
			softwareArray[j] = temp;
		}
		return softwareArray;

	}
	
	public Software[] insertionSortid(Software[] softwareArray, int i) {
		for (int a = 1; a < i; a++) {
			int j = a;
			Software temp = new Software();
			temp = softwareArray[a];
			while (j > 0 && softwareArray[j - 1].getId() > temp.getId()) {
				softwareArray[j] = softwareArray[j - 1];
				j--;
			}
			softwareArray[j] = temp;
		}
		return softwareArray;

	}

	public double generateBill(Software[] softwareArray, int id, int i) {
		double bill = 0;
		for (int b = 0; b < i; b++) {
			if (softwareArray[b].getId() == id) {
				// currSoftware=id;
				bill = (softwareArray[b].getCost()*0.5)+softwareArray[b].getCost();
				System.out.println(bill);

			}
		}
		if (bill == 0) {
			System.out.println("id not found");
		}
		return bill;

		

	}

	public Software[] binarySearch(Software[] softwareArray, int i, int id1) {
		int first = 0;
		int last = softwareArray.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (softwareArray[mid].getId() == id1) {
				System.out.println(softwareArray[mid].getName());
				break;
			} else if (softwareArray[mid].getId() < id1) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return softwareArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SoftwareMain obj = new SoftwareMain();
		System.out.println("enter the size of the array");
		int size = obj.intInput(sc);
		Software[] softwareArray = new Software[size];
		int choice = 0, i = 0;

		//boolean flag=true;
		do {
			System.out.println("1.Add software");
			System.out.println("2.sorting based on cost");
			System.out.println("3.binary search based on id");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			choice = obj.intInput(sc);
			switch (choice) {
			case 1:
				softwareArray[i] = new Software();
				softwareArray = obj.getData(softwareArray, i, sc);
				i++;
				for (int b = 0; b < i; b++)
				System.out.println(softwareArray[b].toString());
				break;
			case 2:
				softwareArray = obj.insertionSort(softwareArray, i);
				for (int b = 0; b < size; b++)
					System.out.println(softwareArray[b].toString());
				System.out.println("enter the software id");
				int id = obj.intInput(sc);
				double bill = obj.generateBill(softwareArray, id, i);
				for (int d = 0; d < i; d++)
					System.out.println(softwareArray[d].toString());

				break;
			case 3:
				softwareArray = obj.insertionSortid(softwareArray, i);
				for (int f = 0; f < i; f++) {
					System.out.println(softwareArray[f].toString());
				}
				System.out.println("enter the id to search");
				int id1 = obj.intInput(sc);
				softwareArray = obj.binarySearch(softwareArray, i, id1);
				for (int c = 0; c < i; c++)
					System.out.println(softwareArray[c].toString());
				break;
			case 4:
				System.out.println("exit");
				break;
			default:
				System.out.println("invalid");

			}
		} while (choice!=4);

	}

}
