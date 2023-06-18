package com.prowings.FileOutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDemo {

	public static void main(String[] args) throws IOException {
		String data = "hello \nhow are u";
		File file = new File("FileOutPutStreamDemo.txt");

		FileOutputStream fos = new FileOutputStream(file);
		fos.write(data.getBytes(), 0, data.length());
		fos.close();

	}
}
