package com.capgemini.queue1.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
	public static void main(String[] args) {
	Queue p1 = new PriorityQueue();
	p1.offer(45);
	p1.offer(25);
	p1.offer(12);
	p1.offer(2);
	p1.offer(89);
	System.out.println(p1.peek());
	System.out.println(p1);
	p1.poll();
	p1.poll();
	System.out.println(p1);
	p1.remove(45);
	System.out.println(p1);
	
	for (Object o1 : p1) {
		System.out.println(o1);
		
	}
	
	}

}
