package collections;

import java.util.*;

public class LinkedListImplementation {
	public int Insert(Scanner sc) {
		int insert = sc.nextInt();
		sc.nextLine();
		return insert;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListImplementation obj = new LinkedListImplementation();
		List<Integer> ll = new LinkedList<Integer>();
		Iterator<Integer> it;
		boolean flag = true;
		do {
			System.out.println("1.add elements");
			System.out.println("2.remove elements");
			System.out.println("3.change elements");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the elements");
				ll.add(obj.Insert(sc));
				break;
			case 2:
				System.out.println("enter the element index to be removed");
				ll.remove(obj.Insert(sc));
				break;
			case 3:
				it = ll.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
					System.out.println("enter the index to change");
					System.out.println("enter the new element");
					ll.set(obj.Insert(sc), obj.Insert(sc));
					break;
				}
			case 4:
				flag = false;
				break;
			}
		} while (flag);

	}

}
