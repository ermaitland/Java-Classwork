package com.ellie.list;

import java.util.LinkedList;
import java.util.Iterator;

public class ArrayListDemo {
	
public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<Integer>();
	
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
/* Linked List works the same - when we store values we store it in the way of nodes, one part is data, one part is address of next node. 
 * The complete thing is known as node. They also carry the address of the previous node as well. Address is null if there is nothing before/after the value.
 * The ways to do things are the same, there is .add / .remove / For each / Iterator.
 */
