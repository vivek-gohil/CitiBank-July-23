package com.citibank.repository;

import java.util.HashSet;
import java.util.Set;

import com.citibank.domain.Employee;

public class EmployeeRepository {
	private Set<Employee> employeeSet = new HashSet<>();

	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		Employee employee = getEmployeeByEmployeeId(employeeId);
		if (employee != null) {
			employeeSet.remove(employee);
			return true;
		}
		return false;
	}

	public boolean updateEmployeeSalary(int employeeId, double newSalary) {
		Employee employee = getEmployeeByEmployeeId(employeeId);
		if (employee != null) {
			employee.setSalary(newSalary);
			return true;
		}
		return false;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	public boolean addNewEmployee(Employee employee) {
		return employeeSet.add(employee);
	}

	public Set<Employee> getAllEmployees() {
		return employeeSet;
	}
}
