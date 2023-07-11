package com.citibank.main;

import com.citibank.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.display();

		System.out.println();

		MyClass myClass2 = new MyClass();
		myClass2.display();

		System.out.println();

		System.out.println(MyClass.number2);
		System.out.println(myClass.number2);
		System.out.println(myClass2.number2);

	}
}
