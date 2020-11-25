package entity;

public class Employee {
private int employeeId;
private String name;
private double salary;
private int age;
public Employee() {
	super();
}
public Employee(int employeeId, String name, double salary, int age) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.salary = salary;
	this.age = age;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + employeeId;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (age != other.age)
		return false;
	if (employeeId != other.employeeId)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
}


	}

}
