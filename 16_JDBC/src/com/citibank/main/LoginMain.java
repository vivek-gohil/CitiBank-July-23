package com.citibank.main;

import java.util.Scanner;

import com.citibank.repository.LoginRepository;

public class LoginMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LoginRepository loginRepository = new LoginRepository();

		String loginId;
		String password;
		String result;
		String choice;

		do {
			System.out.println("Enter LoginId");
			loginId = scanner.next();
			System.out.println("Enter Password");
			password = scanner.next();

			result = loginRepository.validateLoginDetails(loginId, password);
			if (result != null) {
				if (result.equals("max")) {
					System.out.println("Max attempt reached!!");
					System.out.println("exiting");
					System.exit(0);
				} else {
					System.out.println("Hello " + result);
					break;
				}
			} else {
				System.out.println("Invalid userid or password");
			}
			System.out.println("Do you want to try again");
			choice = scanner.next();
		} while (choice.equals("y"));

	}
}
