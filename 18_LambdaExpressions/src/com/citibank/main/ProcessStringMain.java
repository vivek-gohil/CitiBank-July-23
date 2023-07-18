package com.citibank.main;

import com.citibank.domain.ProcessString;

public class ProcessStringMain {
	public static void main(String[] args) {
		ProcessString processString1 = s -> s.toUpperCase();

		ProcessString processString2 = s -> "Length is " + s.length();

		ProcessString processString3 = s -> s.repeat(4);

		System.out.println(processString1.doProcess("hi"));
		System.out.println(processString2.doProcess("LambdaExpression"));
		System.out.println(processString3.doProcess("Hi"));
	}
}
