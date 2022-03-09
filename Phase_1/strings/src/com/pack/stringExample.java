package com.pack;

public class stringExample {

	public static void main(String[] args) {
		
		String s1= new String("Mumbai");
		String s2 = new String("Kolkata");
		
		String s3 = "David";
		String s4 = " Warner";
		
		 s3.concat(s4);
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		
		System.out.println("------------StringBuffer---------\n");
		
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb1 = new StringBuffer("Language");
		
		System.out.println(sb.append(sb1));
		System.out.println(sb.insert(4, " is programming "));
		
		System.out.println("\n--------StringBuilder-------------\n");
		
		
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.delete(1,3);
		System.out.println(sb2);
		

	}

}
