package surefire;

import java.util.stream.Stream;

public class StreamIterateFuncs {
	public static void main(String[] args) {

		// Generating Even Numbers
		Stream.iterate(0, n -> n + 2).limit(10).forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		// Powers of 2
		Stream.iterate(1, n -> n * 2).limit(10).forEach(x -> System.out.print(x + " "));
		System.out.println();
	
		// Fibonacci Series
		Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10).map(f -> f[0])
				.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		// Generate a Repeating Sequence
		Stream.iterate(0, n -> (n + 1) % 3).limit(10).forEach(x -> System.out.print(x + " "));
		
	}
}
