package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Employee;

public class ArraysMain {
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		int size = new Scanner(System.in).nextInt();
		int[] numbers = new int[size];

		numbers[0] = 10;
		numbers[1] = 10;
		numbers[2] = 10;
		numbers[3] = 10;
		numbers[4] = 10;

		for (int i : numbers) {
			System.out.println(i);
		}

		// Create arrays of employees size 5
		// Store 5 employees
		// print all 5 employees
		Employee[] employees = new Employee[5];

		employees[0] = new Employee(101, "Emp 1", 1000);
		employees[1] = new Employee(102, "Emp 2", 1000);
		employees[2] = new Employee(103, "Emp 3", 1000);
		employees[3] = new Employee(104, "Emp 4", 1000);
		employees[4] = new Employee(105, "Emp 5", 1000);

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}
}
