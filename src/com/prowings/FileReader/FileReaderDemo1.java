package com.prowings.FileReader;

import java.io.*;

public class FileReaderDemo1 {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("789.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.println((char) i);
			i = fr.read();
		}

	}

}
