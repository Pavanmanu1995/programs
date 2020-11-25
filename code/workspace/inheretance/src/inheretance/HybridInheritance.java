package inheretance;

class A {
	public void displayA() {
		System.out.println("class A");
	}
}

class B extends A {
	public void displayB() {
		System.out.println("class B");
	}
}

class C extends A {
	public void displayC() {
		System.out.println("class C");
	}
}

class D extends B {
	public void displayD() {
		System.out.println("class D");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		D obj1 = new D();
		obj1.displayA();
		obj1.displayD();
		B obj3=new B();
		obj3.displayA();
		obj3.displayB();
		C obj2 = new C();
		obj2.displayC();
		obj2.displayA();
	}
}
