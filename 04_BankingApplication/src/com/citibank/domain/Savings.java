package com.citibank.domain;

public class Savings extends Account {
	private double minimumBalance = 1500;
	private boolean isSalary;

	public Savings() {
		System.out.println("Savings class constructor called");
	}

	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public boolean withdraw(double amount) {
//		if (isSalary) {
//			return super.withdraw(amount);
//		} else {
//			if (amount > 0 && getBalance() - amount >= minimumBalance) {
//				return super.withdraw(amount);
//			}
//		}
		if (amount > 0 && isSalary && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && isSalary == false && getBalance() - amount >= minimumBalance) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
//		return super.deposit(amount);

		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

}
