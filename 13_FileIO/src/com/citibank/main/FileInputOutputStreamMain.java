package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.InputOutputStream;

public class FileInputOutputStreamMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		String data;

		System.out.println("Enter directory path to write data");
		path = scanner.nextLine();
		System.out.println("Enter file content");
		data = scanner.nextLine();

		File file = new File(path);
		InputOutputStream inputOutputStream = new InputOutputStream();
		boolean result = inputOutputStream.writeFile(file, data);

		if (result) {
			data = inputOutputStream.readFile(file);
			System.out.println("Data from file");
			System.out.println(data);
		}
		else {
			System.out.println("Write operation failed!");
		}

	}
}
