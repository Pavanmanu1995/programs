package demopackage1;
import java.util.Scanner;
public class diagonal {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of the row");
			int n=sc.nextInt();
			System.out.println("enter the size of the columns");
			int m=sc.nextInt();
			int arr[][]=new int[n][m];
			System.out.println("enter the elements");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
				arr[i][j]=sc.nextInt();
				}
			}
					/*for(int i=0;i<n;i++)
					{
						for(int j=0;j<m;j++)
						{
							if(i==j)
							{
							System.out.print(arr[i][j]);
							}*/
							for(int i=0;i<n;i++)
							{
								for(int j=0;j<m;j++)
								{
									if(i+j==n-1)
									{
									System.out.print(arr[i][j]);
					
				}
					}
			}
						}


	}

