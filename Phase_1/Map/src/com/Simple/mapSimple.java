package com.Simple;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapSimple {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"Pune");
		map.put(2,"kolkata");
		map.put(3,"Delhi");
		map.put(4,"Mumbai");
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
