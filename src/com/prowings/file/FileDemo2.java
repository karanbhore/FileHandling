package com.prowings.file;

import java.io.*;

public class FileDemo2 {

	public static void main(String[] args) throws Exception {

		File f = new File("durga123");
		f.mkdir();
		File f1 = new File("durga123", "demo.txt");
//		File f1=new File(f,"demo.txt");
		f1.createNewFile();

	}
}
