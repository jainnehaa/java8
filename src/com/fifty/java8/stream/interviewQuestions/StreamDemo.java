package com.fifty.java8.stream.interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> testList = Arrays.asList("Apple", "Baby", "Cat", "Dog");
		
		System.out.println(testList);
		
		testList.stream()
				.filter(s -> s.startsWith("C"))
				.map(String::toLowerCase)
				.forEach(System.out::println);
		
	}
}
