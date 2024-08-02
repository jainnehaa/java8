package surefire;

import java.util.stream.IntStream;

public class PrimeNumbers {

	public static void main(String[] args) {
		getPrimeNumber(103);
	}

	static void getPrimeNumber(int n) {
		if (n <= 1) {
			System.out.println("No Prime numbers for " + n);
			return;
		}
		IntStream.range(2, n+1).filter(PrimeNumbers::isPrime).forEach(System.out::println);
	}

	private static boolean isPrime(int n) {
	    return IntStream.range(2, (int) Math.sqrt(n) + 1)
	            .noneMatch(i -> n % i == 0);
	}

}
