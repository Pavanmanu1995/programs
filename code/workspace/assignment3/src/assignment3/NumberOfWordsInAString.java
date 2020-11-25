package assignment3;

import java.util.Scanner;

public class NumberOfWordsInAString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;

			}
		}
		System.out.println(count);
	}
}
