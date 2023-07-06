package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Account account = new Account();

		System.out.println("Enter Account Number");
		int accountNumber = scanner.nextInt();

		System.out.println("Enter Name");
		String name = scanner.next();

		System.out.println("Enter Balance");
		double balance = scanner.nextDouble();

		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Account Number = " + account.getAccountNumber());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance = " + account.getBalance());

	}
}
