package com.mindtree.trainbookingsystem.utility;

import java.util.Scanner;

public class Initialize {
	public int setInt() {
	Scanner scan=new Scanner(System.in);
	return scan.nextInt();
	}
	public String setString() {
		Scanner scan=new Scanner(System.in);
		return scan.nextLine();
	}
	public float setFloat() {
		Scanner scan=new Scanner(System.in);
		return scan.nextFloat();
	}
	public double setDouble() {
		Scanner scan=new Scanner(System.in);
		return scan.nextDouble();
	}
}
