package surefire;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSortString {
	public static void main(String[] args) {
		List<String> listStr = new ArrayList<>();
		listStr.add("banana");
		listStr.add("apple");
		listStr.add("custard");
		listStr.add("Amaze");
		
		listStr.stream().sorted().forEach(System.out::println);
		
		System.out.println(listStr.stream().sorted().collect(Collectors.joining(",")));
		
		System.out.println(listStr.stream().sorted(Comparator.reverseOrder()).toList());
		
		System.out.println(String.join(": ", listStr.stream().sorted(Comparator.reverseOrder()).toList()));
		
	}
}
