package com.my.collections;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		setDemo();
//		listDemo();
//		queueDemo;
		mapDemo();
	}
	
	public static void setDemo() {
		Set fruit = new HashSet();
		fruit.add("apple");
		fruit.add("lemon");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("lemon");
		Iterator i = fruit.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		fruit.forEach(x -> System.out.println(x)); // lambda expression
		fruit.forEach(System.out::println);
	}
	
	public static void mapDemo() {
		Map fruitsCalc = new HashMap();
		fruitsCalc.put("apple", 95);
		fruitsCalc.put("lemon", 20);
		fruitsCalc.put("banana", 105);
		fruitsCalc.put("orange", 45);
		fruitsCalc.put("lemon", 17);
	}
	
	
}
