package com.citibank.main;

import com.citibank.domain.Employee;
import com.citibank.domain.Manager;

public class EmployeeManagerMain {
	public static void main(String[] args) {
		System.out.println("main start");

		// Create object of Manager class
		Manager manager = new Manager();
		manager.giveTask();

		Employee employee = new Employee();
		int value = employee.doTask();
		
		System.out.println("Value is :: " + value);

		System.out.println("main end");
	}

}
