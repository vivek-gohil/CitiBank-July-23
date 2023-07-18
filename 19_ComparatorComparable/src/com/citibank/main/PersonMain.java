package com.citibank.main;

import java.util.Arrays;

import com.citibank.domain.Person;

interface Condition {
	boolean test(Person person);
}

public class PersonMain {
	public static void printAll(Person[] people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person))
				System.out.println(person);
		}
	}
	public static void main(String[] args) {
		Person person1 = new Person("Vivek", "Gohil", 33);
		Person person2 = new Person("Gurubux", "Gill", 26);
		Person person3 = new Person("Samarth", "Patil", 12);
		Person person4 = new Person("Trupti", "Acharekar", 38);

		Person[] persons = { person1, person2, person3, person4 };

		// 1. Sort the array by last name
		Arrays.sort(persons);

		// 2. Create a method that prints all the person of array.
		Condition noCondition  = (p) -> true;
		printAll(persons , noCondition);
		// 3. Create a method that prints all people that
		// have last name beginning with G
		System.out.println("Begin with G");
		Condition startWithG = (p) -> {
			if(p.getLastName().startsWith("G")) {
				return true;
			}
			return false;
		};
		printAll(persons, startWithG);
		
		//printAllBeginWithG(persons);
		// 4. Create a method that prints all
		// people that have last name ending with L
		System.out.println("End with L");
		//printAllEndWithL(persons);
	}

}
