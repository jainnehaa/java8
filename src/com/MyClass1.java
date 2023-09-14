package com;

interface AA {
	static void sayStatic() {
		System.out.println("Static method from Interface");
	}
	
	default void sayDefault() {
		System.out.println("Default method from Interface");
	}
	
	default void sayDefaultAgain() {
		System.out.println("Default method from Interface");
	}
}

public class MyClass1 implements AA{
	static void sayStatic() {
		System.out.println("Static method from Class");
	}
	
	//with and without @Override annotation
	//Cannot reduce the visibility of the inherited method from AA
	//default void sayHelloAgain() {
	@Override
	public void sayDefault() {
		System.out.println("Default method from Class");
	}
	
	public static void main(String[] args) {
		MyClass1 class1 = new MyClass1();
		class1.sayStatic(); //called from class
		class1.sayDefault(); //called from class
		class1.sayDefaultAgain(); //called from interface
		
		AA aa = new MyClass1();
		//This static method of interface AA can only be accessed as AA.sayHello
		//aa.sayHello(); // not visible so cannot be called 
		AA.sayStatic(); //called from interface
		aa.sayDefault(); //called from class
		aa.sayDefaultAgain(); //called from interface
		
	}
}
