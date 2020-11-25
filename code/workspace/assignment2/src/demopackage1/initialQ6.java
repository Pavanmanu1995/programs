package demopackage1;
import java.util.Scanner;
public class initialQ6 {
	static void name(String name)
	{
		if(name.length()==0)
			return;
		System.out.print(name.charAt(0));
		for(int i=1;i<=name.length()-1;i++)
		{
			if(name.charAt(i)==' ')
			{
				System.out.print(name.charAt(i+1));
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String name=sc.nextLine();
	name(name);
	 
	
	
	

	}

}
