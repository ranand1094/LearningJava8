package com.java8.practise;

public class ListofGuys implements StudCondInterface {
	
	private String firstName;
	private String lastName;
	private String desig;
	private int salary;
	
	
	
	public ListofGuys(String firstName, String lastName, String desig, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.desig = desig;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ListofGuys [firstName=" + firstName + ", lastName=" + lastName + ", desig=" + desig + ", salary="
				+ salary + "]";
	}
	@Override
	public void printWithCond(String x, String params) {
		// TODO Auto-generated method stub
		
	}
	
	

}
