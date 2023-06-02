package com.prowings.FileReader;

import java.io.*;

public class FileReaderDemo2 {

	public static void main(String[] args) throws Exception {

		File f = new File("7891.txt");
		char[] ch = new char[(int) f.length()];
		FileReader fr = new FileReader(f);
		fr.read(ch);
		for (char ch1 : ch) {
			System.out.println(ch1);
		}

	}
}
