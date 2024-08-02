package surefire;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArray {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Arrays.asList(2, 1, 4, 5, 2, 1, 1).stream().filter(i -> !set.add(i)).collect(Collectors.toSet())
				.forEach(System.out::println);
	}
}

//set.add() true if this set did not already contain the specified element