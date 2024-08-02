package surefire;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElementInArray {
	public static void main(String[] args) {
		System.out.println(Arrays.stream(new int[] { 1, 5, 6, 7, 2, 4 }).boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get());
	}
}
