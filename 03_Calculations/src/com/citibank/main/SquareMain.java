package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Square;

public class SquareMain {
	public static void main(String[] args) {

		// User Input
		Scanner scanner = new Scanner(System.in);
		Square square = new Square();
		
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		System.out.println("Number entered : " + number);
		int result = square.calculateSquare(number);
		System.out.println("Square of " + number + " is : " + result);
		
		System.out.println("Enter Number");
		number = scanner.nextInt();
		System.out.println("Number entered : " + number);
		result = square.calculateSquare(number);
		System.out.println("Square of " + number + " is : " + result);
		
		
		
		
	}
}





