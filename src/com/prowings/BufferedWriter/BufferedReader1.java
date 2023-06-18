package com.prowings.BufferedWriter;

import java.io.*;

public class BufferedReader1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("BufferedWriter1.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
