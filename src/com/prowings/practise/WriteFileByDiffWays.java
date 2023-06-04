package com.prowings.practise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFileByDiffWays {

	public static void main(String[] args) throws Exception {

		String data = "India is most powerful country!!";
		String data1 = "with 28 states";

		writeFileUsingFileWriter(data, data1);

		writeFileUsingBufferedWriter(data, data1);

		writeFileUsingOutputStream(data, data1);

		writeFileUsingFiles(data, data1);

	}

	private static void writeFileUsingFiles(String data, String data1) throws Exception {
		Files.write(Paths.get("F:\\java programs\\FileHandling\\src\\com\\prowings\\practise\\abc"), data.getBytes());

	}

	private static void writeFileUsingOutputStream(String data, String data1) throws IOException {
		File file = new File("F:\\java programs\\FileHandling\\src\\com\\prowings\\practise\\abc");

		FileOutputStream fos = new FileOutputStream(file);

		fos.write(data.getBytes(), 0, data.length());

		fos.close();

	}

	private static void writeFileUsingFileWriter(String data, String data1) throws IOException {

		File file = new File("F:\\java programs\\FileHandling\\src\\com\\prowings\\practise\\abc");

		FileWriter fr = null;
		try {
			fr = new FileWriter(file);
			fr.write(data);
			fr.append(data1);
		} catch (Exception e) {
			System.out.println("exception while writting file!!");
			e.printStackTrace();

		} finally {
			fr.close();
		}
		System.out.println("data written successfully!!");

	}

	private static void writeFileUsingBufferedWriter(String data, String data1) throws IOException {
		File file = new File("F:\\java programs\\FileHandling\\src\\com\\prowings\\practise\\abc");
		FileWriter fr = new FileWriter(file);
		BufferedWriter br = new BufferedWriter(fr);

		br.write(data);
		br.append(data1);

		br.close();

	}
}
