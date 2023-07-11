package com.citibank.main;

import com.citibank.domain.Application;
import com.citibank.domain.Employee;

public class ApplicationMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];

		employees[0] = new Employee(101, "Emp 1", 1000);
		employees[1] = new Employee(102, "Emp 2", 1000);
		employees[2] = new Employee(103, "Emp 3", 1000);
		employees[3] = new Employee(104, "Emp 4", 1000);
		employees[4] = new Employee(105, "Emp 5", 1000);

//		Application application = new Application(employees);
//		application.displayAllEmployees();

		Application application = new Application();
		application.setEmployees(employees);
		application.displayAllEmployees();

	}
}
