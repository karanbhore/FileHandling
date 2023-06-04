package com.prowings.practise;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordOccuranceUsingHashMap {

	public static void main(String[] args) throws Exception {

		List<String> lines = Files
				.readAllLines(Paths.get("F:\\java programs\\FileHandling\\src\\com\\prowings\\practise\\abc"));
		StringBuffer sb = new StringBuffer();

		for (String line : lines) {
			sb.append(line);
			sb.append(" ");
		}
		String input = new String(sb);

		String[] words = input.split(" ");

		System.out.println(Arrays.toString(words));

		HashMap<String, Integer> wordCountMap = new HashMap<>();

		for (String word : words) {
			if (wordCountMap.containsKey(word))
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			else
				wordCountMap.put(word, 1);

		}
		System.out.println(wordCountMap);

	}
}
