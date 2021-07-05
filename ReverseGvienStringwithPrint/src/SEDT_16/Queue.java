package SEDT_16;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
	PriorityQueue p =new PriorityQueue<>();
	
	p.add(39);
	p.add(88);
	p.add(99);
	
	System.out.println(p);
	/*
	System.out.println(p.poll());
	System.out.println(p);
	
	System.out.println(p.poll());
	System.out.println(p);
	*/
	
	System.out.println(p.peek());
	System.out.println(p);

	}

}
