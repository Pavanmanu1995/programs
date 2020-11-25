package collections;
import java.util.Scanner;
import java.util.Stack;
public class StackImplementation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<Integer>();
		boolean flag=true;
		do
		{
			System.out.println("1.push an elements");
			System.out.println("2.pop elements");
			System.out.println("3.search the elements");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the elements to the stack");
				int pushelement=sc.nextInt();
					stack.push(pushelement);
				System.out.println("the elements in the stack is"+" "+stack);
				break;
			case 2:
				System.out.println("the popped element is:"+" "+stack.pop());
				break;
			case 3:
				System.out.println("search the element");
				int Search=sc.nextInt();
				System.out.println("the searched element is"+" "+stack.search(Search));
			case 4:
				flag=false;
				break;
					
				}
			}
		while(flag);
		}
		

	}
