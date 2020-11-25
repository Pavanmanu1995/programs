package reverse;
import java.util.Scanner;
public class ReverseOfAString {
	public static String ReversingOfString(String string,String str1)
	{
		for(int i=0;i<string.length()-1;i++)
		{
			if(string.charAt(i)!=' ')
			{
				str1=str1+string.charAt(i);
				
			}
		}
		return string;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String string=sc.nextLine();
		String str1="";
		String string1= ReversingOfString(string,str1);
		System.out.println(string1);

	}

}
