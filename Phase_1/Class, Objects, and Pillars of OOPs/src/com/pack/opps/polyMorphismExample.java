package com.pack.opps;

public class polyMorphismExample {

	public int addition(int a ,int b) {
		int c = a+b;
		
		return c;
	}
	
	public String addition() {
		return "India is developing country";
	}
	public double addition(double a,double b) {
		double d = a*b;
		return d;
		
	}
	public static void main(String[] args) {
		
		polyMorphismExample obj = new polyMorphismExample();
		System.out.println(obj.addition());
		System.out.println(obj.addition(2,7));
		System.out.println(obj.addition(7.0,8.0 ));
		
;
	}

}
