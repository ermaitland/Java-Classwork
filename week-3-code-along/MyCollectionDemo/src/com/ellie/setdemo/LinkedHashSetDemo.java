package com.ellie.setdemo;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		/*
		 * LinkedHashSet is unique ordered collection of Objects,
		 * collection is auto-growable and auto-shrinkable
		 */
		LinkedHashSet<Integer> collection=new LinkedHashSet<Integer>();
		
		collection.add(45);
		collection.add(50);
		collection.add(67);
		collection.add(30);
		System.out.println(collection);
		
		collection.remove(50);
		System.out.println(collection);
		// here you write the element you want to remove, not the index as these are unordered therefore cannot be removed by it
		
		// traversal using for each loop
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		// transversal using iterator
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// as there its not ordered, for loop is less used/ not indexed so it might not work
	}

}
