package com.prowings.BufferedReader;

import java.io.*;

public class BufferedReaderDemo1 {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("ggg.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();

	}
}
