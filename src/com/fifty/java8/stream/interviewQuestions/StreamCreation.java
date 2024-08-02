package com.fifty.java8.stream.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
	public static void main(String[] args) {
		List<String> testDemo = Arrays.asList("Apple", "Baby", "Cat", "Dog");

		testDemo.stream()
				.filter(s -> s.startsWith("A"))
				.forEach(System.out::print);
		
		System.out.println("\n--------");
		
		testDemo.parallelStream()
				.filter(s -> s.startsWith("B"))
				.forEach(System.out::print);
		
		System.out.println("\n--------");
		
		Arrays.stream(new int[] {1,2,3,4})
				.forEach(a -> System.out.print(a + ","));
		
		System.out.println("\n--------");
		
		Stream.of(new String[] {"Jaipur", "Mumbai"})
				.forEach(a -> System.out.print(a + ","));
		
		System.out.println("\n--------");
		
		IntStream.range(11, 20)
				.forEach(a -> System.out.print(a + ","));
		
	
		
	}
}
