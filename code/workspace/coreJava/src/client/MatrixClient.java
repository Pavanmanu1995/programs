package client;
import java.util.Arrays;
import java.util.Scanner;
import service.MatrixService;
public class MatrixClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int row = sc.nextInt();
		System.out.println("enter the column size");
		int column = sc.nextInt();
		int matrix[][] = new int[row][column];
		System.out.println("enter the elements to the matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
				}
			}
		int size = row * column;
		int temp[] = new int[size];
		MatrixService.toOneDArray(row, column, matrix, temp);
		Arrays.sort(temp);
int result[]=new int[temp.length];
int mid=(temp.length-1)/2;
int x=1,y=1;
MatrixService.arrangeElements(temp,result,mid,x,y);
	}
}
