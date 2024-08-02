package surefire;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyInString {
	public static void main(String[] args) {
		Map<Character, Long> charFreqMap = "Tests".chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charFreqMap);

		"Tests".chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + "," + v));
		
		"Tests".chars().mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.values()
		.forEach(System.out::println);
	}
}

/*
 * Function.identity() is a method reference in Java that returns a function
 * which simply returns its input. In simpler terms, it's a concise way of
 * writing a function that takes an argument and returns the same argument.
 * 
 * The Function.identity() is used as the classifier function in the
 * Collectors.groupingBy collector. In this context, Function.identity() serves
 * as the classifier to group the elements while preserving them.
 * 
 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
 * collects the Stream of characters into a Map<Character, Long>, where:
 * Function.identity() acts as the classifier function for the groupingBy
 * collector. It simply returns the character itself as the key for grouping
 * purposes. Collectors.counting() is the downstream collector, which counts
 * occurrences of each character.
 */