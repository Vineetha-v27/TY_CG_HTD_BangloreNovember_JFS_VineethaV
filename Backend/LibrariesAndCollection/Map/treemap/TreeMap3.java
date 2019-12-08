package com.capgemini.map1.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {
		SortingAge sortAge = new SortingAge();
		TreeMap<Student, String> t1 = new TreeMap<Student, String>(sortAge);
		
		t1.put(new Student(15,"divya"), "9th standard");
		t1.put(new Student(10,"vini"), "6th standard");
		t1.put(new Student(18,"diya"), "12th standard");
		
		Set<Map.Entry<Student, String>> s1 =t1.entrySet();
		for (Map.Entry<Student, String> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------------");
			
		}
		
	}

}
