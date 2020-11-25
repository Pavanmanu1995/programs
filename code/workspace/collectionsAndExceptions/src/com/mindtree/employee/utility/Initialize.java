package com.mindtree.employee.utility;

import java.util.Scanner;

public class Initialize {
	public int setInt()
	{
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
		}
	
		public String setString()
		{
			Scanner sc=new Scanner(System.in);
			return sc.nextLine();
		}
		
		public float setFloat()
			{
				Scanner sc=new Scanner(System.in);
				return sc.nextFloat();
				
			}
		
		public double setDouble()
		{
			Scanner sc=new Scanner(System.in);
			return sc.nextDouble();
			
		}
		
		

}
