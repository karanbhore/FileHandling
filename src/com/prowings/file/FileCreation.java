package com.prowings.file;

import java.io.*;

public class FileCreation {

	public static void main(String[] args) throws Exception {

		File f = new File("F:\\java programs", "karan.txt");
		f.createNewFile();

	}

}
