package com.pack.abstraction;

public class BankUtil {
	
	
	
	public static IBank getObject() {
		
		
		return  new  BankImp2();
		
	}
	

}
