package polymorphism;
class demo1
{
		void test()
		{
			System.out.println("test() is defined in Overriding class");
		}
	}
	class demo2 extends demo1	{
		void test()
		{
			System.out.println("test() is overided in demo2 class");
		}
	}
	
public class Overridding {
	public static void main(String[] args) {
		demo2 obj=new demo2();
		obj.test();
	}

}
