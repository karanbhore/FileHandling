package com.prowings.file;

import java.io.File;

public class DisplayFileNamesOnEclipseDirectory {

	public static void main(String[] args) throws Exception {

		File f = new File("F:\\java programs ");
		String[] s = f.list();
		int count = 0;

		for (String s1 : s) {
			File f1 = new File(f, s1);
			if (f1.isFile()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("the total number of files :" + count);

	}
}
