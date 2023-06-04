package com.prowings.practise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFilebyDiffWays {

	public static void main(String[] args) throws Exception {

		String data = "India is most powerful country";
		String data1 = "with 28 states";

		System.out.println(raedFileUsingFileReader());
		System.out.println();

		System.out.println(readFileUsingBufferedReader());
		System.out.println();
		System.out.println(readFileUsingBufferedReaderWriterLinesMethod());
		System.out.println();
//		readFileUsingFileInputStream(data);

		System.out.println("--------->>>>>>>" + readFileUsingFiles(data));

	}

	private static String readFileUsingBufferedReader() throws Exception {
		File file = new File("F:\\java programs\\FileHandling\\durga123\\demo.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		StringBuffer readData = new StringBuffer();
		try {
			String line;
			while ((line = br.readLine()) != null) {
				readData.append(line);
				readData.append(" ");

			}
		} catch (Exception e) {
			System.out.println("exce while reading file!!");
			e.printStackTrace();
		} finally {
			br.close();
		}
		return new String(readData);
	}

	private static String readFileUsingBufferedReaderWriterLinesMethod() throws Exception {
		File file = new File("F:\\java programs\\FileHandling\\durga123\\demo.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		return br.lines().collect(Collectors.joining(" "));
	}

	private static String readFileUsingFiles(String data) throws Exception {
		List<String> allLines = Files.readAllLines(Paths.get("F:\\java programs\\FileHandling\\durga123\\demo.txt"));

		System.out.println("*******" + allLines.toString());
		StringBuffer sb = new StringBuffer();

		for (String line : allLines) {
			sb.append(line);
			sb.append(" ");

		}

		return new String(sb);
	}

	private static void readFileUsingFileOutputStream(String data) throws Exception {
		File file = new File("F:\\java programs\\FileHandling\\durga123\\demo.txt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(data.getBytes(), 0, data.length());
		fos.close();

	}

	private static String raedFileUsingFileReader() throws Exception {
		File file = new File("F:\\java programs\\FileHandling\\durga123\\demo.txt");
		FileReader fr = null;
		String readData = "";

		try {
			fr = new FileReader(file);
			char dt[] = new char[100];

			fr.read(dt);
			readData = new String(dt);

		} catch (Exception e) {
			System.out.println("exce while reding file!!");
			e.printStackTrace();
		} finally {
			fr.close();
		}
		System.out.println("data read sucessfully");

		return readData;
	}
}
