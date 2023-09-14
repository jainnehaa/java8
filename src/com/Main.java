package com;

@FunctionalInterface
interface MyFunctionalInterface {
    // Single abstract method
    int performOperation(int a, int b);

    // You can have default methods as well
    default void defaultMethod_1() {
        // Implementation here
    }
    
    default void defaultMethod_2() {
        // Implementation here
    }
    
    static void staticMethod_1() {
        // Implementation here
    }
    
    static void staticMethod_2() {
        // Implementation here
    }
}


public class Main {
	public static void main(String[] args) {
		MyFunctionalInterface add = (a, b) -> a + b;
		int result = add.performOperation(5, 3); // result is 8
		System.out.println(result);
		
		MyFunctionalInterface subtract = Math::subtractExact;
		result = subtract.performOperation(10, 3); // result is 7
		System.out.println(result);
		
	}
}
