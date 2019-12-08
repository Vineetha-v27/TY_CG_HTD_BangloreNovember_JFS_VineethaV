package com.capgemini.map1.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		
		HashMap<Integer, Student> h1 = new HashMap<Integer, Student>();
		
		h1.put(34, new Student(22,"vini"));
		h1.put(45, new Student(23, "vinu"));
		h1.put(null, null);
		h1.put(null, new Student(45,"harish"));
		h1.put(34, new Student(24, "vini"));
		
		
		Collection<Student> c1 = h1.values();
		
		for(Student s1 : c1) {
			System.out.println(s1);
		}
		
		Set<Integer> c2 = h1.keySet();
		for (Integer integer : c2) {
			System.out.println(c2);
		}
		System.out.println(h1.containsKey(34));
		System.out.println(h1.containsKey(new Student(22, "vini")));
		
	}

}
