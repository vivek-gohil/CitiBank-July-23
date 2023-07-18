package com.citibank.domain;

public class GreetingsApplication {
	private Greetings greetings;

	public GreetingsApplication(Greetings greetings) {
		this.greetings = greetings;
	}

	public void doGreet() {
		greetings.greet();
	}
}
