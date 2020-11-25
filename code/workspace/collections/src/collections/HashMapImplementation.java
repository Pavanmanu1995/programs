package collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapImplementation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> hm=new HashMap<String,Integer>();
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
				hm.put(name,number);
				System.out.println("the list is"+hm);
				break;
			case 2:
				System.out.println(hm.keySet()+" "+hm.values());
				for(Map.Entry<String, Integer> m:hm.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
				
				break;
			case 3:
				System.out.println(hm.keySet());
				break;
			case 4:
				flag=false;
				break;
				
				
			}
			
		}
		while(flag);

	}

}
