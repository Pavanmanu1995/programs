package polymorphism;

public class Overloading {
	public static int sum(int a, int b)
	{
		return(a+b);
	}
	public static int sum(int a ,int b, int c)
	{
		return(a+b+c);
	}
	public static double sum(double a, double b)
	{
		return(a+b);
	}
	public static double sum(double a,double b,double c)
	{
		return(a+b+c);
	}
	public static float sum(float a,float b)
	{
		return(a+b);
	}
	public static float sum(float a,float b,float c)
	{
		return(a+b+c);
				
	}
	public static String sum(String str1,String str2)
	{
		return(str1+str2);
	}

	public static void main(String[] args) {
		System.out.println(Overloading.sum(4,6));
		System.out.println(Overloading.sum(70,1000,200));
		System.out.println(Overloading.sum(70.0,1000.5));
		System.out.println(Overloading.sum(60,100,500));
		System.out.println(Overloading.sum(5.6,10.65));
		System.out.println(Overloading.sum(800.76,1000.5,1200.89));
		System.out.println(Overloading.sum("Pavan","Suresh"));
		


	}

}
