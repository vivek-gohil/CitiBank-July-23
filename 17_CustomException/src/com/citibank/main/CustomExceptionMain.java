package com.citibank.main;

import com.citibank.domain.Employee;
import com.citibank.exception.InvalidEmployeeSalaryException;

public class CustomExceptionMain {
	public static void main(String[] args) {
		// create an object of Employee class - call the param constr
//		try {
//			Employee employee = new Employee(101, "Vivek Gohil", -1000);
//			System.out.println(employee);
//		} catch (InvalidEmployeeSalaryException e) {
//			System.out.println(e.getMessage());
//		}
//
//		System.out.println("-----------------------");
//		Employee employee2 = new Employee();
//		try {
//			employee2.setSalary(1000);
//		} catch (InvalidEmployeeSalaryException e) {
//			System.out.println(e.getMessage());
//		}

		Employee employee = new Employee(101, "Vivek Gohil", -1000);
		

	}
}
