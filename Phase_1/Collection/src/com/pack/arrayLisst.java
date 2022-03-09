package com.pack;

import java.util.ArrayList;

public class arrayLisst {

	public static void main(String[] args) {
		
		
		ArrayList<String> city = new ArrayList<String>();
		
		city.add("Delhi");
		city.add("Noida");
		city.add("Gurugram");
		city.add("Kolkata");
		
		for(String i: city) {
			System.out.println(i);
		}
	}

}
