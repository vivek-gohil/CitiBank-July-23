package com.citibank.main;

import com.citibank.domain.GoodMorningGreetings;
import com.citibank.domain.Greetings;
import com.citibank.domain.GreetingsApplication;

public class GreetingsApplicationMain {
	public static void main(String[] args) {
		GoodMorningGreetings goodMorningGreetings = new GoodMorningGreetings();
		
		System.out.println();

		Greetings goodEveingGreetings 
					= () -> System.out.println("Good Eveing");

		GreetingsApplication application 
			= new GreetingsApplication(goodEveingGreetings);

		application.doGreet();



	}
}













