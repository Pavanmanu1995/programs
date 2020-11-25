package zeroToLast;
import java.util.Scanner;
public class ZeroToLast {
	public  int[] MoveZeroToLast(int array[],int length) {
		int count=0;
		int temp[]=new int[length];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
			temp[count++]=array[i];
			}
		}
		return temp;
	}
	public void input()
	{
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ZeroToLast obj=new ZeroToLast();
		System.out.println("enter the size of the array");
		int length=sc.nextInt();
		int array[]=new int[length];
		System.out.println("enter the elements to the array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		int a[]=obj.MoveZeroToLast(array,length);
		for(int i=0;i<array.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
