package codingChallange;

import java.util.Scanner;

public class FurnitureMain {
	public static String stringInput(Scanner sc) {
		String input = sc.nextLine();
		return input;
	}

	public  double doubleInput(Scanner sc) {
		double input = sc.nextDouble();
		sc.nextLine();
		return input;
	}

	public int intInput(Scanner sc) {
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	public Furniture[] getData(Furniture[] furnitureArray, int i, Scanner sc) {
		
		System.out.println("enter the furniture id");
		int id = intInput(sc);
		furnitureArray[i].setId(id);
		
		System.out.println("enter the furniture name");
		String name = stringInput(sc);
		furnitureArray[i].setName(name);

		System.out.println("enter the furniture cost");
		double cost = doubleInput(sc);
		furnitureArray[i].setCost(cost);

		System.out.println("enter the furniture quantity");
		int quantity = intInput(sc);
		furnitureArray[i].setQuantity(quantity);
		
		return furnitureArray;

	}
	
	//public static Furniture[] sort(Furniture[] furnitureArray,int i,Scanner sc)
	//{
		
		//return furnitureArray;
	//}
	
	public  Furniture[] purchase(Furniture[] furnitureArray,int i,Scanner sc,String furniture)
	{
		for (int c = 0; c < i; c++) {
			if (furnitureArray[c].getName().equals(furniture)) {
				System.out.println("quantity");
				int quantity =intInput(sc);
				if (furnitureArray[c].getQuantity() > quantity) {
					double amount = furnitureArray[c].getCost()*quantity;
					int left = furnitureArray[c].getQuantity() - quantity;
					System.out.println(left);
				} else {
					System.out.println("not available");
				}
			}
		}
		return furnitureArray;
	}
	public  Furniture[] binarySearch(Furniture[] furnitureArray,int i,Scanner sc,int id)
	{
		int first = 0;
		int last = furnitureArray.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (furnitureArray[mid].getId() == id) {
				System.out.println(furnitureArray[mid].getName());
				break;
			} else if (furnitureArray[mid].getId() < id) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return furnitureArray;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FurnitureMain obj = new FurnitureMain();
		System.out.println("enter the size of the array");
		int size = obj.intInput(sc);
		Furniture[] furnitureArray = new Furniture[size];
		int choice = 0,i = 0;
		do {
			System.out.println("1.Add furnitures");
			System.out.println("2.sort the furniture array based on cost");
			System.out.println("3.purchase of furnitures");
			System.out.println("4.binary sort on furniture id");
			System.out.println("5.exit");
			System.out.println("enter your choice");
			choice = obj.intInput(sc);
			switch (choice) {
			case 1:
				furnitureArray[i]=new Furniture();
				furnitureArray = obj.getData(furnitureArray,i, sc);
				i++;
				break;
			case 2:
				//for(int a=0;a<i;a++)
				//	System.out.println(furnitureArray[a].toString());
				for (int a = 1; a < i; a++) {
					int j=a;
					Furniture temp = new Furniture();
					temp=furnitureArray[a];
					
					while (j > 0 && (furnitureArray[j-1].getCost() < temp.getCost())) {
						furnitureArray[j] = furnitureArray[j -1];
						j--;
					}
					furnitureArray[j] = temp;
				}
				//furnitureArray = obj.sort(furnitureArray,i, sc);
				for (int b = 0; b < i; b++)
					System.out.println(furnitureArray[b].toString());
				break;
			case 3:
				System.out.println("enter the name");
				String furniture = sc.nextLine();
				furnitureArray = obj.purchase(furnitureArray,i,sc,furniture);
				for (int d = 0; d < i; d++)
					System.out.println(furnitureArray[d].toString());
				break;
			case 4:

				System.out.println("enter the  id to find");
				int id = obj.intInput(sc);
				furnitureArray = obj.binarySearch(furnitureArray, i, sc,id);
				for (int e = 0; e < i; e++)
				System.out.println(furnitureArray[e].toString());
				break;
			case 5:
				System.out.println("exit");
				break;

			}
			

		} while (choice != 5);
	}

}
