package com;

interface A {
	default void sayHello() {
		System.out.println("A says Hello");
	}
}

interface B {
	default void sayHello() {
		System.out.println("B says Hello");
	}
}

//Duplicate default methods named sayHello with the parameters () and () are inherited from the types B and A
//quick fix to override default method of A or B
//A.super.sayHello();
public class MyClass implements A, B {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.sayHello();
	}

//	@Override
//	public void sayHello() {
//		A.super.sayHello();
//	}

//	@Override
//	public void sayHello() {
//		B.super.sayHello();
//	}

	@Override
	public void sayHello() {
		System.out.println("My own implementation");
	}

}
