package com.citibank.domain;

public class GoodMorningGreetings implements Greetings {
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
}
