package com.prowings.file;

import java.io.File;

public class AllFilesCheckonSystem {

	public static void main(String[] args) throws Exception {

		File f = new File("F:\\java programs");
		int count = 0;
		String[] s = f.list();

		for (String s1 : s) {
			count++;
			System.out.println(s1);

		}
		System.out.println("the total number: " + count);

	}
}
