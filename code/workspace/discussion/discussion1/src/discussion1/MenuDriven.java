package discussion1;

import java.util.Scanner;

public class MenuDriven {
	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void addition(int a, int arr1[], int arr2[]) {
		int sum[] = new int[a];
		for (int i = 0; i < a; i++) {

			if (i % 2 == 0) {
				sum[i] = arr1[i] + arr2[i + 1];
			} else {
				sum[i] = arr1[i] + arr2[i - 1];

			}

		}
		for (int i = 0; i < a; i++) {
			System.out.println(sum[i]);
		}

	}

	public static int[][] multiplication(int row, int col, int matrix1[][], int matrix2[][]) {
		int mul[][] = new int[row][col];
		int i, j = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				mul[i][j] = 0;
				for (int k = 0; k < row; k++)
					mul[i][j] = mul[i][j] + matrix1[i][k] * matrix2[k][j];
				// System.out.println(mul[i][j]);
			}

		}

		// System.out.println("total sum: "+sum);
		return mul;
	}

	private static int calculateSum(int row, int col, int[][] mul) {
		int i;
		int j;
		int sum = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				sum = sum + mul[i][j];
			}
		}
		return sum;
	}

//	public static void string(String str)
//	{
//		for(int i=0;i<str.length();i++)
//		{
//		if(str.charAt(i)!='A'||str.charAt(i)!='E'||str.charAt(i)!='I'||str.charAt(i)!='O'||str.charAt(i)!='U'||str.charAt(i)!='a'||str.charAt(i)!='e'||str.charAt(i)!='i'||str.charAt(i)!='o'||str.charAt(i)!='u')
//		{
//			
//			if(str.toLowerCase(i))
//			{
//				str.replace(i,i+1,str.toUpperCase());
//				
//			}
//				else
//				{
//					str.replace(str.toLowerCase(i));
//				}
//			}
//		}
//
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("1.pattern");
			System.out.println("2.addition of two array");
			System.out.println("3.mutiplication of matrix");
			System.out.println("4.string");
			System.out.println("5.exit");
			System.out.println("enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the number");
				int n = sc.nextInt();
				pattern(n);

				break;
			case 2:
				System.out.println("enter the size of the array");
				int a = sc.nextInt();
				int arr1[] = new int[a];

				int arr2[] = new int[a];
				System.out.println("enter the matrix1");
				for (int i = 0; i < a; i++) {
					arr1[i] = sc.nextInt();
				}
				System.out.println("enter the matrix2");
				for (int j = 0; j < a; j++) {
					arr2[j] = sc.nextInt();
				}
				addition(a, arr1, arr2);
				break;
			case 3:
				System.out.println("enter the size of row matrix");
				int row = sc.nextInt();
				System.out.println("enter the size of column matrix");
				int col = sc.nextInt();
				int matrix1[][] = new int[row][col];
				int matrix2[][] = new int[row][col];
				System.out.println("enter the matrix1");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						matrix1[i][j] = sc.nextInt();
					}
				}
				System.out.println("enter the matrix2"); {
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						matrix2[i][j] = sc.nextInt();
					}
				}
				int[][] result = multiplication(row, col, matrix1, matrix2);
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.println(result[i][j]);
					}
				}
				int result2 = calculateSum(row, col, result);
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						
						System.out.println(result2);
					}
				}

			}

				break;
			case 4:
				System.out.println("enter the string");
//				String str = sc.nextLine();
//				string(str);
				break;
			case 5:
				flag = false;
			}
		} while (flag);

	}
}
