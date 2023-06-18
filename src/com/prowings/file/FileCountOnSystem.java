package com.prowings.file;

import java.io.*;

public class FileCountOnSystem {

	public static void main(String[] args) {
		File f = new File("C://users//public//desktop");

		String[] s = f.list();

		int count = 0;
		for (String s1 : s) {
			File f1=new File(f,s1);
			if(f1.isDirectory()) {
			count++;
			System.out.println(s1);}
		}
		System.out.println("the total number :" + count);

	}
}
