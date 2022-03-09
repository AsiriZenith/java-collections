package com.javacollectiontutorial;

public class Employee {
	
	private int Id;
	private String name;
	private int age;
	private long salary;
	
	public Employee(int id, String name, int age, long salary) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
