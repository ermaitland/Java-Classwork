package com.ellie.list;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkListDemo2 {
	
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	list.add(34);
	list.add(45);
	list.add(65);
	list.add(90);
	
	System.out.println("Size of list : "+list.size());
	System.out.println(list);
	
	list.add(56);
	list.add(45);
	
	System.out.println("Size of list : "+list.size());
	System.out.println(list);
	
	list.remove(2);
	// can remove from an index value ^ 
	
	System.out.println("Size of list : "+list.size());
	System.out.println(list);
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	System.out.println("---------------------");
	// For each loop: 
	for(Integer element:list) {
		System.out.println(element);
	}
	
	System.out.println("---------------------");
	//Or, help of iterator interface, checks if there is values after it, and if there are 
	//then it does next - which is bring the next element into focus and print the one which has true. hasNext() gets you onto the value being looked at
	//next passes you onto the next
	Iterator<Integer> itrator=list.iterator();
	while(itrator.hasNext()) {
		System.out.println(itrator.next());
	}
}
}
/* ArrayList is duplicate ordered list of collection of objects,
 * collection is auto-growable and auto-shrinkable
 */
