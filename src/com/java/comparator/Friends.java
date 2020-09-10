package com.java.comparator;

public class Friends implements Comparable<Friends> {

	private String name;
	private String age;
	private String number;
	
	
	public Friends(String name, String age, String number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	@Override
	public int compareTo(Friends o) {
 		return this.age.compareTo(o.getAge());
	}
	

}
