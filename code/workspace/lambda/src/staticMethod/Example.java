package staticMethod;

public class Example implements MyInterface {

	@Override
	public void existingMethod(String str) {
		System.out.println("String is:"+str);

	}

	public static void main(String[] args) {
		Example obj=new Example();
		obj.newMethod();
		MyInterface.anotherMethod();
		obj.existingMethod("java 8 feature");

	}

}
