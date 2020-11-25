package demopackage1;

import java.util.Scanner;

public class passwordQ7 {
	static void password(String first, String age) {
		if (first.length() == 0)
			return;
		System.out.print(first.charAt(0));
		for (int i = 1; i <= first.length() - 1; i++) {
			if (first.charAt(i) == ' ') {
				System.out.print(first.charAt(i + 1));

			}
		}
		System.out.println(age);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name");
		String first = sc.nextLine();
		System.out.println("enter the middle name");
		String middle = sc.nextLine();
		System.out.println("enter the last name");
		String last = sc.nextLine();
		first = first + " " + middle + " " + last;
		System.out.println("enter the age");
		String age = sc.next();

		password(first, age);

	}

}
