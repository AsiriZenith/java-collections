package com.javacollectiontutorial;

import java.util.ArrayList;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Ramesh", 30, 400000));
		employees.add(new Employee(2, "Santosh", 29, 500000));
		
		employees.stream().forEach(emp-> System.out.println(emp));
	}
}
