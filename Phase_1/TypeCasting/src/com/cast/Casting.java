package com.cast;

public class Casting {

	public static void main(String[] args) {
	
	// Upcasting
		
		int a = 9;
		
		long b = a;
		
		float c = a;
		
		double d = a;
		
		System.out.println("Before Conversion of value "+ a);
		System.out.println("After Conversion of value "+ b);
		System.out.println("After Conversion of value "+ c);
		System.out.println("After Conversion of value "+ d);
		
		// Downcasting
		
		double x = 90.99;
		
		long l = (long)x;
		
		int i = (int)x;
		char ch = (char)x;
		
		System.out.println("Before Coversion of Value " + x);
		System.out.println("After Coversion of Value " + l);
		System.out.println("After Coversion of Value " + i);
		System.out.println("Conversion of double into char " + ch);
	}

}
