package functionalInterface;

public class Demo {

	public static void main(String[] args) {
		MyFunctionalInterface sum=(a,b) -> a+b;
		System.out.println("result:" +sum.add(12, 100));

	}

}
