package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account;
		int accountNumber;
		String name;
		int choice;
		double amount;
		String continueChoice = "";

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter Name");
		name = scanner.nextLine();

		account = new Account(accountNumber, name);

		System.out.println("Account Number : " + account.getAccountNumber());
		System.out.println("Name : " + account.getName());
		System.out.println("Balance : " + account.getBalance());

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
				if (account.withdraw(amount))
					System.out.println("Withdraw successfull!");
				else
					System.out.println("Withdraw failed!");
				break;
			case 2:
				System.out.println("You have selected deposit");
				System.out.println("Enter amount");
				amount = scanner.nextDouble();
				if (account.deposit(amount))
					System.out.println("deposit successfull!");
				else
					System.out.println("deposit failed!");
				break;
			case 3:
				System.out.println("Balance :: " + account.getBalance());
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
