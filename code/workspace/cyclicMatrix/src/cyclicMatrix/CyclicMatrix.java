package cyclicMatrix;
import java.util.Scanner;
public class CyclicMatrix {
	public int[][] Matrix(int array[][],int row,int column)
	{
		
					int temp=array[0][0];
					array[0][0]=array[row-1][0];
					array[row-1][0]=array[row-1][column-1];
							array[row-1][column-1]=array[0][column-1];
							array[0][column-1]=temp;
							return array;
				}

		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CyclicMatrix obj=new CyclicMatrix();
		System.out.println("enter the row size");
		int row=sc.nextInt();
		System.out.println("enter the Column size");
		int column=sc.nextInt();
		int array[][]=new int[row][column];
		System.out.println("enter the elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		int cycle[][]=obj.Matrix(array,row,column);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(cycle[i][j]+" ");
			}
			System.out.println();
			
		}
	
	}
}
