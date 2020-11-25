package implementation;
abstract class Animal
{
	public abstract void animalSound();
	public void sleep()
	{
		System.out.println("zzzzz");
	}
}
class Dog extends Animal
{
	public void animalSound()
	{
		System.out.println("barks");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.animalSound();
		obj.sleep();
	}

}
