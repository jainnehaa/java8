package com;

interface Emp {
	public String getSalary();

	public String getDesignation();

	
}

public class AnonymousClassLambda {
	public static void main(String[] args) {
		Emp emp = new Emp() {

			@Override
			public String getSalary() {
				return "100";
			}

			@Override
			public String getDesignation() {
				return "Software Engineer";
			}
		};

		System.out.println(emp.getSalary());
		System.out.println(emp.getDesignation());
	}
}
