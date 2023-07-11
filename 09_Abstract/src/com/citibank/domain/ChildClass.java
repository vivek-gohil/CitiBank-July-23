package com.citibank.domain;

public abstract class ChildClass extends MyClass {

	public ChildClass() {
		System.out.println("Default constructor of ChildClass");
	}

	public void show() {
		System.out.println("show() of ChildClass");
	}

}
