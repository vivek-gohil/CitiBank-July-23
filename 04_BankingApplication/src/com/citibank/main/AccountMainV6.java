package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Current;
import com.citibank.domain.Savings;

public class AccountMainV6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Current current;
		int accountNumber;
		String name;
		double balance;
		double overdraftBalance;
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

		System.out.println("Enter Overdraft Balance");
		overdraftBalance = scanner.nextDouble();

		current = new Current(accountNumber, name, balance, overdraftBalance);

		System.out.println("Account Number : " + current.getAccountNumber());
		System.out.println("Name : " + current.getName());
		System.out.println("Balance : " + current.getBalance());
		System.out.println("Overdraft Balance :: " + current.getOverdraftBalance());

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
				if (current.withdraw(amount))
					System.out.println("Withdraw successfull!");
				else
					System.out.println("Withdraw failed!");
				break;
			case 2:
				System.out.println("You have selected deposit");
				System.out.println("Enter amount");
				amount = scanner.nextDouble();
				if (current.deposit(amount))
					System.out.println("deposit successfull!");
				else
					System.out.println("deposit failed!");
				break;
			case 3:
				System.out.println("Balance :: " + current.getBalance());
				System.out.println("Overdraft Balance :: " + current.getOverdraftBalance());
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
