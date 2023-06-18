package com.prowings.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFileFromClassPath2 {

	public static void main(String[] args) throws IOException {

		ReadFileFromClassPath2 readFileFromClassPath2 = new ReadFileFromClassPath2();

		InputStream in = readFileFromClassPath2.getClass().getClassLoader().getResourceAsStream("demo");

		InputStreamReader rd = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(rd);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

	}
}
