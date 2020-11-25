package collections;

import java.util.*;

public class ArrayListImplementation {
	public String insert(Scanner sc) {
		String insert = sc.nextLine();
		sc.nextLine();
		return insert;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ArrayListImplementation obj=new ArrayListImplementation();
		List<String> list = new ArrayList<String>();
		Iterator<String> it;
		boolean flag = true;
		do {
			System.out.println("1.add elements to the array list");
			System.out.println("2.display contant");
			System.out.println("3.remove the 3rd object and display the result using each loop");
			System.out.println("4.display the size of the object");
			System.out.println("5.add iterator to retrive the object");
			System.out.println("6.exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the elements to the array list");
				String elementToAdd = sc.next();

				list.add(elementToAdd);
				break;
			case 2:
				System.out.println("contant of array list");
				System.out.println(list);
				break;
			case 3:
				list.remove(2);
				for (String str : list) {
					System.out.println(str);
				}
				break;
			case 4:
				int size = list.size();
				System.out.println("the size of the array list:" + " " + size);
				break;
			case 5:

				it = list.listIterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 6:
				flag = false;
				break;

			}
		} while (flag);

	}

}
