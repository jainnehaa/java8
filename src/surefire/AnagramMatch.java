package surefire;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramMatch {
	public static void main(String[] args) {
		String s1 = Stream.of("phase".split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		String s2 = Stream.of("shape".split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());;
		String s3 = Stream.of("shade".split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());;
		
		if (s1.equals(s2)) 
			System.out.println("phase and shape are Anagrams");
		if (s1.equals(s3)) 
			System.out.println("phase and shade are Anagrams");
	}
}
