package defaultMethod;

public interface MyInterface {
	default void newMethod()
	{
		System.out.println("newly added default method");
		
	}
	void existingMethod(String str);
}
