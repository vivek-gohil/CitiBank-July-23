package com.citibank.threads;

import com.citibank.domain.Account;

public class DepositThread implements Runnable {
	private Account account;
	private double amount;
	private Thread thread;

	public DepositThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		account.deposit(amount);
	}
}
