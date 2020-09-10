package com.java.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingName {

	public static void main(String[] args) {
 Employee emp = new Employee("Anand",10.22);
 Employee emp1 = new Employee("Anand2",20.56);
 Employee emp2 = new Employee("Anand1",2.45);
 Employee emp3 = new Employee("Anand4",4.00);
 Employee emp4 = new Employee("Anand6",12.5);
 
 List<Employee> empLs = Arrays.asList(emp,emp1,emp2,emp3,emp4)
		 		.stream()
		 		.sorted((a,b)->a.getName().compareTo(b.getName()))
 				.sorted((a,b)->a.getSalary().compareTo(b.getSalary()))
 				.collect(Collectors.toList());
 
 empLs.forEach(s -> System.out.println(s.getName()+" - "+s.getSalary()));
	}

}

class Employee{
	String name;
	Double salary;
	
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
