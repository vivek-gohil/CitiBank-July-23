package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.BufferedReaderWriter;

public class BufferedReaderWriterMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		String data;

		System.out.println("Enter directory path to write data");
		path = scanner.nextLine();
		System.out.println("Enter file content");
		data = scanner.nextLine();

		File file = new File(path);
		BufferedReaderWriter bufferedReaderWriter = new BufferedReaderWriter();

		bufferedReaderWriter.writeFile(file, data);
		System.out.println();
		data = bufferedReaderWriter.readFile(file);
		System.out.println(data);

	}
}
