package assignment4;
import java.util.Scanner;
public class BookStoreMainQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		BookStoreEmployee[] book=new BookStoreEmployee[size];
		boolean flag=true;
		do{
			int choice;
			System.out.println("1.to enter the details of the book");
			System.out.println("2.display the details of the book");
			System.out.println("3.exit");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			for(int i=0;i<size;i++) {
			System.out.println("enter the name of the book title");
			sc.nextLine();
			String title=sc.nextLine();
			System.out.println("enter the price of the book");
			Double price=sc.nextDouble();
			System.out.println("enter the year of publication");
			int year=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the author name");
			String author=sc.nextLine();
			
			book[i]=new BookStoreEmployee(title,price,year,author);
			}
			break;
			case 2:
		System.out.println("the book details are");
		for(int i=0;i<size;i++)
		{
			System.out.println("book title:"+book[i].getBookTitle());
			System.out.println("book price:"+book[i].getPrice());
			System.out.println("year of publication:"+book[i].getYear());
			System.out.println("author name:"+book[i].getAuthorName());
		}
		break;
			case 3:
				flag=false;
	}
	}while(flag);
}
}
