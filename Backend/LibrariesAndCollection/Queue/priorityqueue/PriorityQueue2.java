package com.capgemini.queue1.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		
		pq.offer(new Student(22,"vini"));
		pq.offer(new Student(23,"vidya"));
		pq.offer(new Student(22,"vini"));
		
		for (Object object : pq) {
			System.out.println(object);
			
		}
		
	}

}
