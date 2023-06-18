package com.prowings.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesClassReadDemo {

	public static void main(String[] args) throws IOException {
		List<String> allLines=Files.readAllLines(Paths.get("F:\\java programs\\FileHandling\\src\\com\\prowings\\files\\FilesDemo1"));
		allLines.toString();
		
		StringBuffer sb=new StringBuffer();
		for(String line:allLines) {
			sb.append(line);
			sb.append(" ");
			
		}
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
	}
}
