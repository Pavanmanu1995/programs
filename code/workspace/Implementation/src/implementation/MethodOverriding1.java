package implementation;

public class MethodOverriding1 {
	void display() {
		System.out.println("parent class");
	}
}

class childA extends MethodOverriding1 {
	void display() {
		System.out.println("ChildA class");
	}
}

class childB extends MethodOverriding1 {
	void display() {
		System.out.println("ChildB class");
	}
}

class childC extends MethodOverriding1 {
	void display() {
		System.out.println("ChildC class");
	}
}

class demo {
	public void main(String[] args) {
		childA obj1 = new childA();
		obj1.display();
		childB obj2 = new childB();
		obj2.display();
		childC obj3 = new childC();
		obj3.display();
	}
}
