package demopackage1;

import java.util.Scanner;

public class reverseStringQ11 {
	static void reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		
			{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="";
		System.out.println("enter the string");
		s=sc.nextLine();
		reverse(s);
		
		
	}

}
