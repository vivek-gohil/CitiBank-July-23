package com.citibank.domain;

public class BlockDemo {
	private int x = 10;
	{
		System.out.println("non-static block called!");
		System.out.println("x = " + x);
	}

	public BlockDemo() {
		System.out.println("Default constructor called");
		System.out.println("x = " + x);
	}

	static {
		System.out.println("static block called!");
		// System.out.println("x = " + x); only static variables
	}

	public static void show() {
		System.out.println("static method called");
	}

	public void display() {
		System.out.println("non static method called");
	}

}
