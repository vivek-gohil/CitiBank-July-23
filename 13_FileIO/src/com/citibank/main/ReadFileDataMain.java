package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;

public class ReadFileDataMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;

		System.out.println("Enter file/directory path to print data");
		path = scanner.nextLine();

		File file = new File(path);
		
		ReadFileData readFileData = new ReadFileData();
		//String data = readFileData.readData(file);
		String data = readFileData.readCharByChar(file);
		System.out.println(data);
		
	}
}


