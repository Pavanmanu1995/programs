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
public class SingleInheretance {

	public static void main(String[] args) {
		B obj=new B();
		obj.displayB();
		obj.displayA();
	}

}
