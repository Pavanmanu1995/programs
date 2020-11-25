package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class collections {
	
	public static void main(String args[])
	{
		HashSet<Employee> set = new HashSet<Employee>();
		Employee emp = new Employee("pavan",100);
		Employee emp1 = new Employee("ram",1000);
		Employee emp2 = new Employee("erty",200);
		set.add(emp);
		set.add(emp1);
		set.add(emp2);
		System.out.println(set.toString());
		System.out.println(set.stream().filter(i -> i.getEmployeeName().equalsIgnoreCase("ram")).collect(Collectors.toSet()));
		System.out.println(set.stream().filter(i -> i.getSalary() == 100).collect(Collectors.toList()));
		System.out.println(set.stream().map(e -> e.getSalary()).reduce(0.0,(a,b)->a+b));
		System.out.println(set.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
		
		HashMap<String, Double> map =new HashMap<String, Double>();
		map.put("yasaswi", 23.45);
		map.put("naitik", 345.76);
		System.out.println(map.toString());
		
		
		
	}
}
