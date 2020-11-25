package inheretance;
class A
{
	public void displayA()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	public void displayB()
	{
		System.out.println("class B");
	}
}
class C extends A
{
	public void displayC()
	{
		System.out.println("class C");
	}
}
class D extends A
{
	public void displayD()
	{
		System.out.println("class D");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		B obj1=new B();
		
		obj1.displayB();
		obj1.displayA();
		C obj2=new C();
		obj2.displayC();
		obj2.displayA();
		D obj3=new D();
		obj3.displayD();
		obj3.displayA();
		

	}

}
