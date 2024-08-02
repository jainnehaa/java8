package surefire;

import java.util.Arrays;

public class CommonElementsBetweenTwoArrays {
	public static void main(String[] args) {
		String[] arr1 = {"This", "is", "amazing"}; 
		String[] arr2 = {"That", "too", "is", "amazing"};
		
		Arrays.stream(arr1).filter(Arrays.asList(arr2)::contains).forEach(System.out::println);
	}
}
