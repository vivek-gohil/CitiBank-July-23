package com.citibank.domain;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p) {
		int diff = lastName.compareTo(p.getLastName());
		return diff;
	}

}
