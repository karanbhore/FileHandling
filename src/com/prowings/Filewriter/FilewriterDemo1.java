package com.prowings.Filewriter;

import java.io.*;

public class FilewriterDemo1 {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("FilewriterDemo1.txt");
		fw.write(100);
		fw.write("urga \n Software Solutions");
		fw.write("\n");
		char[] ch1 = { 'a', 'b', 'c' };
		fw.write(ch1);
		fw.write('\n');
//		fw.flush();
		fw.close();

	}
}
