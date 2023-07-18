package com.citibank.exception;

public class InvalidEmployeeSalaryException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Salary must be > 0";
	}
}
