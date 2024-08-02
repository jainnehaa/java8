package surefire;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseLettersInWordsNotOrderInStatement {
	public static void main(String[] args) {
		String str = "This is a sentence";
		String reversedStr = Arrays.stream(str.trim().split(" "))
		.map(word -> new StringBuffer(word).reverse())
		.collect(Collectors.joining(" "));
		
		System.out.println(reversedStr);
		
	}
}
