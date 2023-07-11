package com.citibank.main;

import com.citibank.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Vivek", 1000);
		Employee employee2 = new Employee(102, "Seema", 1000);

		System.out.println(employee.toString());
		System.out.println("hashcode of employee = " + employee.hashCode());

		System.out.println(employee2.toString());
		System.out.println("hashcode of employee2 = " + employee2.hashCode());

	}
}
