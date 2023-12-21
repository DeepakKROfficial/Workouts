package Workouts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

 class Employee{
	
	public Employee(String name1, Integer age1) {
		name = name1;
		age = age1;
	}
	
	private String name;
	
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	} 
}

public class MainFunction {
	
	public static void main(String[]args) {
		
		Employee obj = new Employee("ABC", 25);
		Employee obj1 = new Employee("BCD", 20);
		Employee obj2 = new Employee("EFG", 13);
		Employee obj3 = new Employee("HIJ", 16);
		Employee obj4 = new Employee("JLM", 17);
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(obj);
		empSet.add(obj1);
		empSet.add(obj2);
		empSet.add(obj3);
		empSet.add(obj4);	
		System.out.println(empSet);
	}

}
