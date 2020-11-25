package demopackage1;
import java.util.Scanner;
public class matrixAdditionQ15 {
static void matrixAddition(int n,int m)
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	int matrix1[][]=new int[n][m];
	int matrix2[][]=new int[n][m];
	int sum[][]=new int[n][m];
	System.out.println("enter the elements of the 1st matrix");
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			matrix1[i][j]=sc.nextInt();
		}
		}
	System.out.println("enter the elements of 2nd matrix");
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			matrix2[i][j]=sc.nextInt();
	}
	}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
sum[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
System.out.println("sum of matrix is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(sum[i][j]);
}
System.out.println();
}
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("enter the number of rows");
		n=sc.nextInt();
		System.out.println("enter the number of columns");
		m=sc.nextInt();
		matrixAddition(n,m);
		}
}
