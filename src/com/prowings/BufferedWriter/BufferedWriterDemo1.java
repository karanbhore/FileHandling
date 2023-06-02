package com.prowings.BufferedWriter;

import java.io.*;

public class BufferedWriterDemo1 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("ggg.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		char[] ch = { 'a', 'b', 'c' };
		bw.write(ch);
		bw.newLine();
		bw.write("durga");
		bw.newLine();
		bw.write("software solutions");
		bw.flush();
		bw.close();

	}
}
