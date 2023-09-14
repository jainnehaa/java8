package com;

@FunctionalInterface
interface Employee {
	public String getName();
}

public class MyClass3 {

	public static void main(String[] args) {
		Employee softwareEngineer = () -> "Software Engineer";
		System.out.println(softwareEngineer.getName());
		
		Employee editor = () -> "Editor";
		System.out.println(editor.getName());
	}

}
