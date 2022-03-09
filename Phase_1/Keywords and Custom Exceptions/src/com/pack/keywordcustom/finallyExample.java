package com.pack.keywordcustom;

public class finallyExample {
	public static void main(String[] args) {
		
		int a=100,b=0,c;
		try {
			c=a/b;
			System.out.println(c);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finnaly block always run either there is exception or not.....");
		}
	}

}
