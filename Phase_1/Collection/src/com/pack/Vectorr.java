package com.pack;
import java.util.*;
public class Vectorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> vec = new Vector<Integer>();
		vec.add(101);
		vec.add(102);
		vec.add(103);
		vec.add(104);
		vec.add(105);
		vec.add(106);
		vec.add(107);

		System.out.println(vec);
		
		if(vec.contains(101)) {
			System.out.println("101 is present in Vector");
		}else {
			System.out.println("Not Present");
		}
		
		System.out.println(vec.capacity());
		System.out.println(vec.hashCode());
		System.out.println(vec.remove(4));
		System.out.println(vec.hashCode());
		System.out.println(vec.isEmpty());
		
		
	}

}
