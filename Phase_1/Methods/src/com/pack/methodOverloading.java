package com.pack;

public class methodOverloading {

	public int addition(int x, int y) {
		int z = x+y;
		return z;
	}
	
	public double addition(int a, int b, int c) {
		int d= a+b+c;
		return d;
	}
	
	public static void main(String[] args) {
		 methodOverloading mo = new methodOverloading();
		 int x=20 , y=10,z=30;
		 System.out.println("Output of 1st method "+ mo.addition(x, y));
		 System.out.println("Output of 2nd method "+ mo.addition(x, y,z));
		

	}

}
