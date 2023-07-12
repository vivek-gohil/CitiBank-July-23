package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;

public class ReadMultipleFilesMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;

		System.out.println("Enter directory path to print all files data");
		path = scanner.nextLine();

		File file = new File(path);
		File [] allFiles = file.listFiles();
		ReadFileData readFileData = new ReadFileData();
		
		for (File f : allFiles) {
			if(f.isFile()) {
				String data = readFileData.readData(f);
				System.out.println(f.getName());
				System.out.println(data);
				System.out.println();
			}
		}
	}
}
