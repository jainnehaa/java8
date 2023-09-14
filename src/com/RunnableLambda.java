package com;

public class RunnableLambda {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello " + i);
			}
		};
		Thread childThread = new Thread(runnable);
		childThread.start();
	}
}
