package com.fifty.java8.latest.interviewQuestions;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(":", "[", "]");
		sj.add("One").add("Two").add("Three");

		for (int i = 0; i < 3; i++) {
			sj.add(String.valueOf(i));
		}

		String desiredString = sj.toString();

		System.out.println(desiredString);

	}
}
