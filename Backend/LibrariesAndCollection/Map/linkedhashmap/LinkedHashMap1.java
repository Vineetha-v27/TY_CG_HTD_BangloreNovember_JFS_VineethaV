package com.capgemini.map1.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<String, Integer>();
		lm.put("BTM", 560072);
		lm.put("Rajajinagar",560001);
		lm.put("BTR", 678003);
		
		lm.remove("BTM");
		System.out.println("-----------------------------------");
		System.out.println(lm.containsKey("Rajajinagar"));
		System.out.println("-----------------------");
		System.out.println(lm.keySet());
		System.out.println("-------------------------");
		System.out.println(lm.values());
		System.out.println("--------------------------");
		System.out.println(lm);
		Set<Map.Entry<String,Integer>> s1 = lm.entrySet();
		
		for(Map.Entry<String, Integer> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------");
			
		}
		
		
	}

}
