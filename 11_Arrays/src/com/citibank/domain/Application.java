package com.citibank.domain;

public class Application {
	private Employee[] employees;

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public Application(Employee[] employees) {
		this.employees = employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public void displayAllEmployees() {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
