package com.example.dictionary.exercises;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1 {

	public static void main(String[] args) throws Exception {
		final List<String> words = Files.readAllLines(Paths.get("src", "dictionary.txt"));
		// Find the words starting with letters A to M
		Predicate<String> startswithA = word -> word.startsWith("AM".toLowerCase());
		words.stream().filter(startswithA).collect(Collectors.toList()).forEach(System.err::println);
	}

}
