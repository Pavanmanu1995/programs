package implementation;

public class MethodOverloading {
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	public static double multiply(double a,double b)
	{
		return a*b;
	}
	public static double multiply(int a,int b,int c)
	{
		return a*b*c;
	}

	public static void main(String[] args) {
		System.out.println(MethodOverloading.multiply(2, 3));
		System.out.println(MethodOverloading.multiply(6.0, 7.0));
		System.out.println(MethodOverloading.multiply(6,4,3));
		

	}

}
