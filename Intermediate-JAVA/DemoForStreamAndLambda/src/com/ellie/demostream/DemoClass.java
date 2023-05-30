package com.ellie.demostream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoClass {

	public static void main(String[] args) {
		List<String> collection=Arrays.asList("Zara","Sujata","Rosie","Lily","Ellie", "Jessica");
		
		collection.stream().
		filter(name-> name.length()>=6). //predicate
		forEach(name-> System.out.println(name)); // Consumer
		
		collection.stream().
		filter(name-> name.length()>=6). //predicate
		map(name->name.toLowerCase()). // action, e.g. go to lower case
		forEach(name-> System.out.println(name)); // Consumer
		
		List<String> finalList=collection.stream().
		filter(name-> name.length()>=6). //predicate
		map(name->name.toLowerCase()). // action, e.g. go to lower case
		collect(Collectors.toList()); // Consumer
		System.out.println(finalList);
		
		long totalCount=collection.stream().
		filter(name-> name.length()>=6).
		count();
		System.out.println(totalCount);
	}

}
