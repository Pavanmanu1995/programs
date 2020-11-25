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
class C extends B
{
	public void displayC()
	{
		System.out.println("class C");
	}
}
public class MultilevelInheretance {

	public static void main(String[] args) {
		C obj=new C();
		obj.displayA();
		obj.displayB();
		obj.displayC();

	}

}
