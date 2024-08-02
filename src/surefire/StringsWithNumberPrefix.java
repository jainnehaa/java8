package surefire;

import java.util.Arrays;
import java.util.List;

public class StringsWithNumberPrefix {
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Apple","1_Banana","Carrot","2_Dish");
		listStr.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
	}
}