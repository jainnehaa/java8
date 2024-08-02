package surefire;

import java.util.stream.Stream;

public class FibonacciSeries {
	public static void main(String[] args) {
		Stream.iterate(new int[] {0,1}, f-> new int[] {f[1], f[0] + f[1]})
		.limit(10)
		.map(f -> f[0])
		.forEach(i -> System.out.print(i + " "));
	}
	
	/*
	 * Stream.iterate generates an infinite sequential stream where the first
	 * element is {0, 1} (representing the first two numbers of the Fibonacci
	 * sequence). 
	 * 
	 * The lambda function f -> new int[]{f[1], f[0] + f[1]} generates
	 * the next element in the sequence by swapping the previous elements and
	 * calculating the next Fibonacci number. For each iteration, it generates an
	 * array where the first element is the second element of the previous pair
	 * (f[1]), and the second element is the sum of the previous pair (f[0] + f[1]).
	 * 
	 * map extracts the first element of each pair in the stream (which represents the Fibonacci number) 
	 * and creates a new stream containing only these numbers.
	 * 
	 * 
	 */
}
