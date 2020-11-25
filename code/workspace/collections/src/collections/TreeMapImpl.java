package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		boolean flag=true;
		do
		{
			System.out.println("1.enter the names and phone numbers");
			System.out.println("2.look up in the book");
			System.out.println("3.display names in the book");
			System.out.println("4.exit");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("enter the name");
				String name=sc.nextLine();
				System.out.println("enter the phone number");
				int number=sc.nextInt();
				tm.put(number,name);
				System.out.println("the list is"+tm);
				break;
			case 2:
				System.out.println(tm.keySet()+" "+tm.values());
				for(Map.Entry m:tm.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
				break;
			case 3:
				System.out.println(tm.keySet());
				break;
			case 4:
				flag=false;
				break;	
			}	
		}
		while(flag);
	}
	}

