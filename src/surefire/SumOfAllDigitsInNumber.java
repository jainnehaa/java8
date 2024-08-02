package surefire;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsInNumber {
	public static void main(String[] args) {
		System.out.println(Stream.of(String.valueOf(54326).split(""))
				.collect(Collectors.summingInt(Integer::parseInt)));
	}
}
