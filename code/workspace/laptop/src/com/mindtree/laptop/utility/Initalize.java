package com.mindtree.laptop.utility;

import java.util.Scanner;

public class Initalize {
public int intInput()
{
	Scanner sc=new Scanner(System.in);
	return sc.nextInt();	
}

public double doubleInput()
{
	Scanner sc=new Scanner(System.in);
	return sc.nextDouble();
}

public String stringInput()
{
	Scanner sc=new Scanner(System.in);
	return sc.nextLine();
}

}
