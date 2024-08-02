package surefire;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SegregateOddEvenNumbers {

	public static void main(String[] args) {
		  Map<Boolean, List<Integer>> oddEvenMap = IntStream.range(1,100)
				  .boxed()
				  .collect(Collectors.partitioningBy(i->i%2==0));
		  System.out.println("Odd : " + oddEvenMap.get(false));
		  System.out.println("Even : " + oddEvenMap.get(true));
		  
		  IntStream.range(1,100)
		  .boxed()
		  .collect(Collectors.partitioningBy(i->i%2==0))
		  .forEach((key, value) -> {
              if (key) {
                  System.out.println("Even Numbers: " + value);
              } else {
                  System.out.println("Odd Numbers: " + value);
              }
          });
	}
	
	/*
	 * The IntStream.range(1, 100) generates a stream of primitive int values from 1
	 * to 99. By applying the boxed() method, it converts this IntStream into a
	 * Stream<Integer> where each int is boxed into its corresponding Integer
	 * object. This conversion allows you to use stream operations that are
	 * available for objects (like Collectors.partitioningBy in your case) rather
	 * than specific primitive stream operations.
	 * 
	 * 
	 */
}
