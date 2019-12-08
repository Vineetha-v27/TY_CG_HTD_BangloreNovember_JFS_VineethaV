package com.capgemini.queue1.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque<String> aq = new ArrayDeque<String>();
		
		aq.add("vini");
		aq.add("vidya");
		aq.add("divya");
		aq.add("mickey");
		System.out.println(aq);
		aq.addFirst("darling");
		System.out.println(aq);
		aq.addLast("lalli");
		System.out.println(aq);
		
		System.out.println(aq.getFirst());
		
		System.out.println(aq.getLast());
		aq.remove("lalli");
		System.out.println(aq);
		
		System.out.println(aq.removeFirst());
		System.out.println(aq);
		
		System.out.println(aq.removeLast());
		System.out.println(aq);
		
		System.out.println(aq.removeFirstOccurrence("vidya"));
		System.out.println(aq.removeLastOccurrence("divya"));
		System.out.println(aq);
		
		System.out.println(aq.peek());
		System.out.println(aq.peekFirst());
		System.out.println(aq.peekLast());
		
		System.out.println(aq.poll());
		System.out.println(aq.pollFirst());
		System.out.println(aq.pollLast());
		
		System.out.println(aq.offer("vidya"));
		System.out.println(aq.offerFirst("varshi"));
		System.out.println(aq.offerLast("gang"));
		System.out.println(aq);
		aq.push("vini");
		System.out.println(aq);
		aq.pop();
		System.out.println(aq);
		
//		Iterator itr = aq.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		aq.add(23);
//		aq.add(2);
//		aq.addFirst(45);
//		aq.add(34);
//		aq.add(78);
//		aq.add(4);
//		
//		Iterator itr = aq.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}
		
	}

}
