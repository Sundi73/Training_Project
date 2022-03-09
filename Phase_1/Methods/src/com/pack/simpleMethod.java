package com.pack;

public class simpleMethod {

	public int squareRoot(int x) {
		
		int z = x*x;
		return z;
	}
	
	public String name(String n) {
		return "Welome to world of java " + n;
	}
	
	
	public static void main(String[] args) {
		
		simpleMethod sm = new simpleMethod();
		
		int y = 7;
		
		System.out.println("Square Root of "+y+" is "+sm.squareRoot(y) );
		System.out.println(sm.name("Ashutosh"));
		
		
		
	}

}
