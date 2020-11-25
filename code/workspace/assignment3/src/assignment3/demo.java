package assignment3;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=sc.nextLine();
	//	int visited=-1;
		for(int i=0;i<str.length();i++)
		{ 
				int count=0;
				for(int j=0;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						count++;
						//int temp[j]=visited;
					
						
					}
					if(i>j && str.charAt(i)==str.charAt(j))
							{
						break;
							}
					if(j==str.length()-1)
					{
					System.out.println(str.charAt(i)+" "+"is repeated"+" "+count);

				}
					
			}
		}
	}
}
			
			
		
		

