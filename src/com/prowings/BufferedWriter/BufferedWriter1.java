package com.prowings.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("BufferedWriter1.txt"); 
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("hi");
		bw.newLine();
		bw.write("rahul");
		bw.newLine();
		bw.write(100);
		bw.newLine();
		char[] ch1= {'a','b'};
		bw.write(ch1);
		
		
		
		bw.flush();
		bw.close();
//		bw.write(100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
