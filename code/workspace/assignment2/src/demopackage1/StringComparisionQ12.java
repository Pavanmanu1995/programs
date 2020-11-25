package demopackage1;
import java.util.Scanner;
public class StringComparisionQ12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		String s="";
		System.out.println("enter the string");
		s=sc.nextLine();
		char previous=s.charAt(0);
		for(int i=1;i<s.length();i++)
		{
			char curr=s.charAt(i);
if(previous==curr&& i+1<=s.length())
{
	count++;
	System.out.println(count);
}

	}
	}
}
