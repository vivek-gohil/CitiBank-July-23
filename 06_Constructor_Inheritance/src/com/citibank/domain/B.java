package com.citibank.domain;

public class B extends A {
	public B() {
		super();
		System.out.println("Default constrcutor of B");
	}
	
	public B(int x) {
		super(x);
		System.out.println("Paramterized constructor of B");
		System.out.println("x = " + x);
	}
}
