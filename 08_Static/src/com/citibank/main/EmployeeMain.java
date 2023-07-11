package com.citibank.main;

import com.citibank.domain.Employee;
import com.citibank.domain.MyClass;

public class EmployeeMain {

	static int x = 10;

	public static void main(String[] args) {
		System.out.println(x);

		Employee e1 = new Employee("One", 1000);
		Employee e2 = new Employee("Two", 1000);
		Employee e3 = new Employee("Three", 1000);
		Employee e4 = new Employee("Four", 1000);
		Employee e5 = new Employee("Five", 1000);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		MyClass.display();
		
		
	}
}
