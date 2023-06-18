package com.prowings.Filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("FileWriterDemo2.txt"); 
		fw.write(100);
		fw.write("urga \n software Solutions");
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		
		
		
		
		
		
		
		
		
		
	}
}
