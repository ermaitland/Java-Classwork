package com.ellie.stateCapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class StateCapitals {

	public static void main(String[] args) {
		HashMap<String, String> stateCapital=new HashMap<String, String>();
		
		stateCapital.put("Alabama", "Montgomery");
		stateCapital.put("Alaska", "Juneau");
		stateCapital.put("Arizona", "Phoenix");
		stateCapital.put("Arkansas", "Little Rock");

		System.out.println("STATES:");
		Set<String> stateName=stateCapital.keySet();
		for(String state:stateName) {
			System.out.println(state);
		}
		
		System.out.println("\nCAPITALS");
		Collection<String> capitals=stateCapital.values();
		System.out.println(capitals);
		
		System.out.println("\nSTATE AND CAPITAL");
		for(String state: stateName) {
			System.out.println(state +" - "+ stateCapital.get(state));
		}
	}

}
