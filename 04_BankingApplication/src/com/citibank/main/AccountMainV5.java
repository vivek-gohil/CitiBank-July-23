package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Savings;

public class AccountMainV5 {
	public static void main(String[] args) {
//		Savings savings = new Savings(101, "Vivek Gohil", 10000, false);
//		Savings savings2 = new Savings(102, "Sagar Thakur", 10000, true);
//
//		boolean result = savings.withdraw(8000);
//		System.out.println("Result = " + result);

		Scanner scanner = new Scanner(System.in);
		Savings savings;
		int accountNumber;
		String name;
		double balance;
		boolean isSalary;
		int choice;
		double amount;
		String continueChoice = "";

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter Name");
		name = scanner.nextLine();

		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		System.out.println("Do you want to open salary account( true/false )");
		isSalary = scanner.nextBoolean();

		savings = new Savings(accountNumber, name, balance, isSalary);

		System.out.println("Account Number : " + savings.getAccountNumber());
		System.out.println("Name : " + savings.getName());
		System.out.println("Balance : " + savings.getBalance());
		System.out.println("Is Salary :: " + isSalary);

		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Display Balance");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You have selected withdraw");
				System.out.println("Enter amount");
				amount = scanner.nextDouble();
				if (savings.withdraw(amount))
					System.out.println("Withdraw successfull!");
				else
					System.out.println("Withdraw failed!");
				break;
			case 2:
				System.out.println("You have selected deposit");
				System.out.println("Enter amount");
				amount = scanner.nextDouble();
				if (savings.deposit(amount))
					System.out.println("deposit successfull!");
				else
					System.out.println("deposit failed!");
				break;
			case 3:
				System.out.println("Balance :: " + savings.getBalance());
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
		System.out.println("Thank you!");

	}
}
