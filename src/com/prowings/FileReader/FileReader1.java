package com.prowings.FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
//		FileReader fr=new FileReader("789.txt");
//		
//		int i=fr.read();
//		while(i!=-1) {
//			System.out.println((char)i);
//			i=fr.read();
		File f = new File("789.txt");
		char[] ch = new char[(int) f.length()];
		FileReader fr = new FileReader(f);
		fr.read(ch);
		for (char ch1 : ch) {
			System.out.println(ch1);
		}

	}

}
