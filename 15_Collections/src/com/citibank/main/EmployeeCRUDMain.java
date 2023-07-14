package com.citibank.main;

import java.util.List;
import java.util.Scanner;

import com.citibank.domain.Employee;
import com.citibank.repository.EmployeeRepository;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee;

		int choice;
		String continueChoice;
		int employeeId;
		String name;
		double salary;
		boolean result;
		do {
			System.out.println("Menu");
			System.out.println("1. Add New Employee");
			System.out.println("2. Update Salary Of Existing Employe");
			System.out.println("3. Display Single Employee Details ");
			System.out.println("4. Display All Employees");
			System.out.println("5. Delete Single Employee");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Name");
				name = scanner.nextLine();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();
				employee = new Employee(employeeId, name, salary);
				result = employeeRepository.addNewEmployee(employee);
				if (result)
					System.out.println("Employee added successfully");
				else
					System.out.println("Failed to add new employee!");
				break;
			case 2:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				System.out.println("Enter New Salary");
				salary = scanner.nextDouble();
				result = employeeRepository.updateEmployeeSalary(employeeId, salary);
				if (result)
					System.out.println("Salary is updated successfully");
				else
					System.out.println("No employee found!");
				break;
			case 3:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				employee = employeeRepository.getEmployeeByEmployeeId(employeeId);
				if (employee != null) {
					System.out.println("Employee found!");
					System.out.println(employee);
				} else
					System.out.println("No employee found!");
				break;
			case 4:
				for (Employee e : employeeRepository.getAllEmployees()) {
					System.out.println(e);
				}
				break;
			default:

				break;
			}

			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
	}
}
