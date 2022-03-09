package com.Simple;

import java.util.Set;
import java.util.*;

public class treemap1 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(101, "Alex");
		tm.put(102, "Bolton");
		tm.put(103, "Charlie");
		tm.put(101, "Dexter");
		
		System.out.println("Output of TreeMap ");
		
		Set set = tm.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		tm.remove(103);
		System.out.println("After invoking remove() method "+tm);
	}
	

}
