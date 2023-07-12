package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;
import com.citibank.util.WriteFileData;

public class CopyPasteMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		System.out.println("Enter file/directory path to print data");
		path = scanner.nextLine();
		File file = new File(path);
		ReadFileData readFileData = new ReadFileData();
		String data = readFileData.readData(file);
		System.out.println("Enter directory path to write data");
		path = scanner.nextLine();
		file = new File(path + "/copy.txt");
		WriteFileData writeFileData = new WriteFileData();
		boolean result = writeFileData.writeData(file, data);
		if (result)
			System.out.println("Please check your file!");
		else
			System.out.println("Write operation failed!");
	}
}
