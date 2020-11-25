package demopackage;

public class MyFirstClass {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("the value of a after swapping is" +a);
		System.out.println("the value of b after swapping is" +b);
	}

}
