package com.elle.generics;

public class GenericInput<K> {
	// This can be used instead of writing redundant Integer, String and Double versions of the same code. Specifiy the datatype once you declare the obj
	private K value;

	public K getValue() {
		return value;
	}

	public void setValue(K value) {
		this.value = value;
	}
	
	

}
