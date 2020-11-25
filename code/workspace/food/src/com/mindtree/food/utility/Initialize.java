package com.mindtree.food.utility;

import java.util.Scanner;

public class Initialize {
	public int intInput()
	{
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	
	public String stringInput()
	{
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
	}
	
	public double doubleInput()
	{
		Scanner sc=new Scanner(System.in);
		return sc.nextDouble();
		
	}

}
