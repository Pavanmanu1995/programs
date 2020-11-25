package assignment3;
import java.util.Scanner;
public class BinarySearchOfAString {
	public static boolean binarySeachOfString(int n,String string[],String name)
	{
		int first=0;
		int last=string.length-1;
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(string[mid].compareTo(name)==0)
			{
				return true;
			}
			else if(string[mid].compareTo(name)<0)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		return false;
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int n=sc.nextInt();
	sc.nextLine();
	String string[]=new String[n];
	System.out.println("enter the string to the array");
	for(int i=0;i<n;i++)
	{
		string[i]=sc.nextLine();
	}
	System.out.println("enter the string need to be found");
	String name=sc.nextLine();
	boolean x=binarySeachOfString(n,string,name);
	if(x)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	

	}

}
