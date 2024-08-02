package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorLambda {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(10);
		list.add(38);
		list.add(23);
		list.add(13);
		Collections.sort(list); // asc
		System.out.println(list);
		Collections.sort(list, (a, b) -> (b - a)); // desc - compare method
		System.out.println(list);

		Set<Integer> set = new TreeSet<>(); // asc
		set.add(3);
		set.add(6);
		set.add(2);
		System.out.println(set);
		set = new TreeSet<>((a, b) -> (b - a)); // desc
		set.add(32);
		set.add(62);
		set.add(22);
		System.out.println(set);

		Map<Integer, String> map = new TreeMap<>(); // asc
		map.put(3, "z");
		map.put(6, "f");
		map.put(2, "y");
		System.out.println(map);
		map = new TreeMap<>((a, b) -> (b - a)); // desc - order of key
		map.put(3, "z");
		map.put(6, "f");
		map.put(2, "y");
		System.out.println(map);
		
		Student s1 = new Student(5, "amar");
		Student s2 = new Student(3, "akbar");
		Student s3 = new Student(1, "anthony");
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		Collections.sort(studentList, (a, b) -> (b.id - a.id));
		System.out.println(studentList);
	}
	
	//static inner class
	static class Student {
		private int id; //would be accessible in same class by variable name also 
		private String name;
		
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
		
	}
}

