package matrix;
import java.util.Scanner;
public class Matrix {
	public static int[] insertionSort(int matrix[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int temp=matrix[i];
			int j=i;
			while(j>0 && matrix[j-1]>temp)
			{
				matrix[j]=matrix[j-1];
				j=j-1;
			}
			matrix[j]=temp;
		}
		return matrix;
		
	}
	public static int[] BubbleSort(int matrix[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(matrix[j]>matrix[j+1])
				{
					int temp=matrix[j];
					matrix[j]=matrix[j+1];
					matrix[j+1]=matrix[j];
				}
				
			}
		}
		return matrix;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the matrix");
		int n=sc.nextInt();
		int matrix[][]=new int[n][n];
		System.out.println("enter the elements to the martix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix.length;j++)
				{
					for(int k=0;k<matrix[i].length-j-1;k++)
					{
					if(matrix[i][k]>matrix[i][k+1])
					{
						int temp=matrix[i][k];
						matrix[i][k]=matrix[i][k+1];
						matrix[i][k+1]=temp;
						
					}
					}
				}
			}
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix.length;j++)
					{
					System.out.println(matrix[i][j]+" ");
					
					}
			}
	}
}

