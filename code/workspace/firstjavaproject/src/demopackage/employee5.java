package demopackage;

import java.util.Scanner;

public class employee5 {
	static void demo(String empId, String jobBand, int depCode) {
		if ((jobBand.equals("c1") || jobBand.equals("c2") || jobBand.equals("c3") || jobBand.equals("c4"))
				&& (depCode >= 110 && depCode <= 125)) {
			System.out.println(empId);
			System.out.println(jobBand);
			System.out.println(depCode);
		}
		else
			System.out.println("invalid");
	}

	public static void main(String[] args) {
		String empId;
		int depCode;
		String jobBand;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employeeid");
		empId = sc.nextLine();
		System.out.println("enter the job band");
		jobBand = sc.nextLine();
		System.out.println("enter the department code");
		depCode = sc.nextInt();
		demo(empId, jobBand, depCode);

	}

}
