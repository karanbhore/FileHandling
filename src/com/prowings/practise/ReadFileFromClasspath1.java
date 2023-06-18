package com.prowings.practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class ReadFileFromClasspath1 {

	public static void main(String[] args) throws URISyntaxException, IOException {
		ReadFileFromClasspath1 obj = new ReadFileFromClasspath1();
		URL url = obj.getClass().getClassLoader().getResource("demo");
		File file = new File(url.toURI());
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();

	}
}
