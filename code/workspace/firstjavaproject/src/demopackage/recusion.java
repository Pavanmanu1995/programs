package demopackage;

public class recusion {
	public static int gcd(int a,int b)
	{
		if(b!=0)
			
		{
			return gcd(b,a%b);
			 
			//	return a;
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println("enter the value of a");
		//int a=sc.nextInt();
		System.out.println("enter the value of b");
		


	}

}
