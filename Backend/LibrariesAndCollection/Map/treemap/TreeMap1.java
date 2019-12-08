package com.capgemini.map1.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		
		t1.put(24, "vinu");
		t1.put(12, "vini");
		t1.put(78, "vidya");
		
		System.out.println(t1.containsKey(24));
		System.out.println("-------------------");
		System.out.println(t1.containsValue("vini"));
		System.out.println("------------------------");
		System.out.println(t1.size());
		System.out.println(t1.isEmpty());
		System.out.println(t1.values());
		System.out.println(t1.remove(12));
		
		
		Set<Map.Entry<Integer, String>> s1 = t1.entrySet();
		for (Map.Entry<Integer, String> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("----------------------------");
			
			
			
			
		}
		
		
		
	}

}
