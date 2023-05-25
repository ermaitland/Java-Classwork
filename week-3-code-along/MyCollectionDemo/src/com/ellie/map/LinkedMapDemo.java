package com.ellie.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> months=new LinkedHashMap<String, Integer>();
		
		// put instead of add for the Linked hashmap
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		months.put("Jun", 30);
		
		System.out.println("Size : "+months.size());
		System.out.println(months);
		
		Set<String> monthsName=months.keySet();
		for(String monthName:monthsName) {
			System.out.println(monthName+" contains : "+months.get(monthName)+" days!");
		}
		
		
		Collection<Integer> days=months.values();
		System.out.println(days);
	}

}
/* Linked Hash map is the collection of Key value pairs where keys are unique and value can be duplicated
 * and ordered is in respect to the key 
*/ 