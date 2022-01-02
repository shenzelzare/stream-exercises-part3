package com.example.dictionary.exercises;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise6 {

	public static void main(String[] args) throws Exception {
		final List<String> words = Files.readAllLines(Paths.get("src", "dictionary.txt"));
		// Find the words starting with the letter a, and ends with the letter z
		Predicate<String> startswithA = word -> word.startsWith("a");
		Predicate<String> endswithZ = word -> word.endsWith("z");
		words.stream().filter(startswithA.and(endswithZ)).collect(Collectors.toList()).forEach(System.err::println);
	}

}
