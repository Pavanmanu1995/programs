package service;
import java.util.Arrays;
public class MatrixService {
	public static void toOneDArray(int row, int column, int[][] matrix, int[] temp) {
		int c = 0;
		System.out.println("the 1d array is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				c = i * column + j;
				temp[c] = matrix[i][j];
				System.out.println(temp[c] + "\t");
				c++;
				}
		}
		}
	public static void arrangeElements(int[] temp,int[] result,int mid,int x,int y )
	{
	result[mid] = temp[0];
	for (x = 1; x <= mid; x++) {
		result[mid + x] = temp[y++];
		result[mid - x] = temp[y++];
		}
	if (temp.length % 2 == 0) {
		result[mid + x] = temp[y];
		}
	System.out.println("the matrix arrangement is");
	for (int i = 0; i < result.length; i++) {
		System.out.println(result[i] + " ");
		}
	}
}
