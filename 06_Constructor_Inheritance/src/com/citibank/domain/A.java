package com.citibank.domain;

public class A {
	public A() {
		System.out.println("Default constrcutor of A");
	}

	public A(int x) {
		System.out.println("Paramterized constructor of A");
		System.out.println("x = " + x);
	}
}
