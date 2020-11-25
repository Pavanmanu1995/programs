package demopackage1;
import java.util.Scanner;
public class stringArray {
	static int traversalAndFind(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(findElements(a[i]))
			{
				count++;
			}
			return count;
		}
		
	}
	Static boolean findElements(String a )
	{
		boolean b=false;
		if(a.length()==1)
		{
		if(a.charAt(0)>='0'&& a.charAt(0)<='9')
			b=true;
		return b;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}
		
	}

