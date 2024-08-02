package com.fifty.java8.latest.interviewQuestions;

interface Person {
	public default void printType() {
		System.out.println("I am a Person");
	}
}

interface Employee {
	public default void printType() {
		System.out.println("I am a Employee");
	}
}

public class Teacher implements Person, Employee{

	//If printType() is not overriden : compliation error of : 
	
	//Duplicate default methods named printType with the parameters () and () are inherited from the types Employee and Person
	
	//default methods allowed only in interfaces
	public void printType() {
		System.out.println("I am a Teacher");
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.printType();
	}

}
