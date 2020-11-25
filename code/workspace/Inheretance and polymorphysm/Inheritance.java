package implementation;
class parent
{
	void display1()
	{
		System.out.println("parent class");
	}
	}
	class A extends parent
	{
		void display2()
		{
			System.out.println("childA class");
		}
		}
	
	class B extends parent
	{
		void display3()
		{
			System.out.println("B class");
		}
		}
	
	class C extends parent
	{
		void display4()
		{
			System.out.println("childC class");
		}
		}
	

public class Inheritance {
	public static void main(String[] args) {
		A obj1=new A();
		obj1.display1();
		B obj2=new B();
		obj2.display3();
		
		}
	}

