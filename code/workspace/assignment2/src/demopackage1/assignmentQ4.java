package demopackage1;
import java.util.Scanner;
public class assignmentQ4 {

	public static void main(String[] args) {
		int num,reverse=0,reminder;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		while(num!=0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
			
		}
		System.out.println("reversed number is"+reverse);
		}
		

	}

