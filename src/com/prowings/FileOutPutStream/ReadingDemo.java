package com.prowings.FileOutPutStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("FileOutPutStreamDemo.txt");
		int i = fis.read();

		while (i != -1) {
			System.out.println((char) i);
			i = fis.read();
		}
		fis.close();
	}
}
