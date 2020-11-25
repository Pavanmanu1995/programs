package implementation;

import java.util.Scanner;

public class Encapsulation {
	private int id;
	private String name;
	private int age;
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static class encap {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			Encapsulation obj=new Encapsulation();
			obj.setName("101");
			obj.setName("james");
			obj.setName("21");
		System.out.println("name"+" "+obj.getId());
		System.out.println("name"+" "+obj.getName());
		System.out.println("name"+" "+obj.getAge());
		}
		}
	}
