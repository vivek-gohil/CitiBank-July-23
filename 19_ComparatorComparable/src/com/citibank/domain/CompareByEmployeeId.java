package com.citibank.domain;

import java.util.Comparator;

public class CompareByEmployeeId implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmployeeId() - e2.getEmployeeId();
	}

}
