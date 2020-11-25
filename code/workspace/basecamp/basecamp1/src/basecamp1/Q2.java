package basecamp1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int menu;
		System.out.println("enter the menu");
		menu=sc.nextInt();
		int arr[]=new int[10];
		
		
		switch (menu)
		{
		case 1:
			System.out.println("enter the marks");
			for(int i=0;i<=10;i++)
			{
				arr[i]=sc.nextInt();
				System.out.println("the entered marks are"+arr[i]);
				}
			
			break;
		case 2:
			int large=arr[0];
			int small=arr[0];
			for(int i=0;i<=arr.length;i++) 
			{
				if(arr[i]>large)
				{
					large=arr[i];
				}
				else if(arr[i]<small)
				{
					small=arr[i];
				}
				System.out.println("largest is"+large);
				System.out.println("smallest is"+small);
			}
			break;
		case 3:
			int first=arr[0];
			int second=arr[0];
			int third=arr[0];
			for(int i=0;i<=arr.length;i++)
			{
				if(arr[i]>first)
				{
					first=arr[i];
				}}
				for(int i=0;i<=arr.length;i++)
				{
					if(arr[i]>second && arr[i]<first)
						second=arr[i];
				}
				for(int i=0;i<=arr.length;i++)
				{
					if(arr[i]>third && arr[i]<second)
						third=arr[i];
				System.out.println("the third largest element is"+third);		
				}
		case 4:
			System.out.println("exit");
			break;
			default:
				System.out.println("invalid");
			
			
		}
	

	}

}
