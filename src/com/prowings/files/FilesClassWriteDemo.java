package com.prowings.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesClassWriteDemo {

	public static void main(String[] args) throws IOException {
		String data = "india is my country \nI love my country";
		Files.write(Paths.get("F:\\java programs\\FileHandling\\src\\com\\prowings\\files\\FilesDemo1"), data.getBytes());

	}
}
