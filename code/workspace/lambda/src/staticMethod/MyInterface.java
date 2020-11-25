package staticMethod;

public interface MyInterface {
	default void newMethod()
	{
		System.out.println("this is the default method");
	}
	static void anotherMethod()
	{
		System.out.println("this static method");
	}
	void existingMethod(String str);
}
