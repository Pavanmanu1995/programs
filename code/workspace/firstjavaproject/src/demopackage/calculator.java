package demopackage;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		char n;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the operation");
		n=sc.next().charAt(0);
		switch(n)
		{
		case '+':
			result=a+b;
		break;
		case '-':
			result=a-b;
		case '*':
			result=a*b;
		break;
		case '/':
			result=a/b;
			break;
			default:
				System.out.println("error");

		}

	}

}
