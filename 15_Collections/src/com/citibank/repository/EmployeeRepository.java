package com.citibank.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.domain.Employee;

public class EmployeeRepository {
	private List<Employee> employeeList = new ArrayList<>();

	public boolean updateEmployeeSalary(int employeeId, double newSalary) {
		Employee employee = getEmployeeByEmployeeId(employeeId);
		if (employee != null) {
			employee.setSalary(newSalary);
			return true;
		}
		return false;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	public boolean addNewEmployee(Employee employee) {
		return employeeList.add(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeList;
	}
}
