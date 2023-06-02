package com.prowings.FileReader;

import java.io.*;

public class FileReaderDemo3 {

	public static void main(String[] args) throws Exception {

		File f = new File("789.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int) f.length()];
		fr.read(ch);
		for (char ch1 : ch) {
			System.out.println(ch1);
		}
		System.out.println("*******");
		FileReader fr1 = new FileReader("789.txt");
		int i = fr1.read();
		while (i != -1) {
			System.out.println((char) i);
			i = fr1.read();
		}

	}

}
