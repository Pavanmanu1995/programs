package demopackage1;

import java.util.Scanner;

public class studentMarksQ18 {
	public static int[] mark(int marks[],int n)
	{
		int count;
		for (int i = 0; i < n; i++) {
			if ((marks[i] >= 0) && (marks[i] <= 25)) {
				System.out.println("the entered marks are" + marks[i]);
			} else {
				System.out.println("eneter the marks in the range of 0 to 25");
			}
		}
		int temp[] = new int[n];
		int visited = -1;
		for (int i = 0; i < n; i++) {
			count = 1;
			for (int j = i + 1; j < n; j++) {
				if (marks[i] == marks[j]) {
					count++;
					temp[j] = visited;
				}
			}
			if(temp[i]!=visited)
			{
				temp[i]=count;
			}

		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int marks[] = new int[n];
		System.out.println("enter the marks");
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		int[] c=mark(marks,n);
		for(int i=0;i<n;i++)
		{
			if(c[i]!=-1)
				System.out.println(marks[i]+"="+c[i]);
		}
	}
}
