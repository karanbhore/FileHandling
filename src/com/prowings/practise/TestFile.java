package com.prowings.practise;

import java.io.File;

public class TestFile {

	public static void main(String[] args) throws Exception {

		String path = "F:\\java programs\\FileHandling\\src\\Abhikhade";

		File file = new File(path);

		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());

		if (!file.exists()) {
			file.createNewFile();
			System.out.println("created file successfully");

		} else {
			System.out.println("already exists!!");

		}
		System.out.println("name :" + file.getName());
		System.out.println("abs path " + file.getAbsolutePath());
		System.out.println("can path " + file.getCanonicalPath());
		System.out.println("total space : " + file.getTotalSpace());

		if (file.exists()) {
			file.delete();
			System.out.println("deleted file successfully!!");

		} else
			System.out.println("already exists!!");

	}
}
