package demopackage1;

import java.util.Scanner;

public class ExchangingNamesQ8 {
	static String[] name(String name1, String name2) {
		int i, j;
		String firstName1 = "";
		String lastName1 = "";
		String firstName2 = "";
		String lastName2 = "";
		for (i = 0; i < name1.length(); i++)
			if (name1.charAt(i) == ' ')
				break;
			else
				firstName1 = firstName1 + name1.charAt(i);

		for (i = 0; i < name1.length(); i++)
			if (name1.charAt(i) == ' ')
				for (j = i + 1; j < name1.length(); j++)
					lastName1 = lastName1 + name1.charAt(j);

		for (i = 0; i < name2.length(); i++)
			if (name2.charAt(i) == ' ')
				break;
			else
				firstName2 = firstName2 + name2.charAt(i);

		for (i = 0; i < name2.length(); i++)
			if (name2.charAt(i) == ' ')
				for (j = i + 1; j < name2.length(); j++)
					lastName2 = lastName2 + name2.charAt(j);

		String str[] = new String[2];

		str[0] = firstName1 + " " + lastName2;
		str[1] = firstName2 + " " + lastName1;
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = "";
		String name2 = "";
		System.out.println("enter the 1st name");
		name1 = sc.nextLine();
		System.out.println("enter the 2nd name");
		name2 = sc.nextLine();
		String[] result = name(name1, name2);
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

}
