package com.capgemini.map1.treemap;


import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap4 {
	public static void main(String[] args) {
		ArrayList<Student1> l1 = new ArrayList<Student1>();
		l1.add(new Student1(22,"vini"));
		l1.add(new Student1(20,"vvvr"));
		l1.add(new Student1(24,"vinu"));
		//System.out.println(l1);
		
		TreeMap<String,ArrayList<Student1>> t1 = new TreeMap<String,ArrayList<Student1>>();
		t1.put("Engineering 1st year", l1);
		System.out.println(t1.get("Engineering 1st year"));
//		t1.put("4th standard", l1);
//		t1.put("10th standard", l1);
		
		Set<Map.Entry<String, ArrayList<Student1>>> s1 = t1.entrySet();
		for (Map.Entry<String, ArrayList<Student1>> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------");
		}
		
		
		
	}

}
