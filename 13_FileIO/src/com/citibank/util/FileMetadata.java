package com.citibank.util;

import java.io.File;
import java.util.Date;

public class FileMetadata {

	public void printMetadata(File file) {
		if (file.exists()) {
			System.out.println("Parent folder = " + file.getParent());
			System.out.println("File path = " + file.getAbsolutePath());
			System.out.println("Name of file = " + file.getName());
			System.out.println("Size = " + file.length() + " bytes");

			Date date = new Date(file.lastModified());

			System.out.println("Last accessed On = " + date);
			System.out.println("Can read = " + file.canRead());
			System.out.println("Can write = " + file.canWrite());
			System.out.println("Can execute = " + file.canExecute());
			System.out.println("Is file = " + file.isFile());
			System.out.println("Is directory = " + file.isDirectory());
			System.out.println("Is hidden = " + file.isHidden());

		} else {
			System.out.println("File dosenot exists!");
		}
	}
}
