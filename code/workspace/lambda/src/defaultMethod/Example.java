package defaultMethod;

public class Example implements MyInterface {

	public void existingMethod(String str) {
		System.out.println("String is: "+str);

	}

	public static void main(String[] args) {
		Example obj=new Example();
		obj.newMethod();
		obj.existingMethod("java 8");

	}

}
