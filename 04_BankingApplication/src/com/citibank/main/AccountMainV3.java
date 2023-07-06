package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMainV3 {
	public static void main(String[] args) {
		System.out.println("main start");

//		Account account = new Account();
//		Account account2 = new Account();
//		Account account3 = new Account();

//		Account account;

//		System.out.println(new Account().getAccountNumber());

		Account account = new Account(101, "Vivek", 100);
		System.out.println(account.getName());

		// call constrcutor with two args and print both values
		Account account2 = new Account(101, "Sagar");
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());

		System.out.println("depsit = 2000");
		boolean result = account2.deposit(2000);
		if (result)
			System.out.println("Transaction success");
		else
			System.out.println("Transaction failed");

		System.out.println("Balance = " + account2.getBalance());
		
		System.out.println("Withdraw = 10000");
		result = account2.withdraw(10000);
		if (result)
			System.out.println("Transaction success");
		else
		System.out.println("Transaction failed");
		System.out.println("Balance = " + account2.getBalance());
		
		
		System.out.println("main end");
	}
	
	
	
}










