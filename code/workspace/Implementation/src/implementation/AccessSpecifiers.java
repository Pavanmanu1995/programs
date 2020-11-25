package implementation;

public class AccessSpecifiers {
	private int id;
	private String name;
	private double salary;
	public AccessSpecifiers(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static class access
	{
		public static void main(String[] args)
		{
			 AccessSpecifiers obj=new AccessSpecifiers(44332,"Pavan",50000);
			 System.out.println(obj.getId());
			 System.out.println(obj.getName());
			 System.out.println(obj.getSalary());
		}
	}
}

