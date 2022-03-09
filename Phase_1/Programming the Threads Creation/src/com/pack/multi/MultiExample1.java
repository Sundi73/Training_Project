package com.pack.multi;

public class MultiExample1 extends Thread {
	
	public void run() {
		System.out.println("Invoking thread1 by extending thread class");
	}
	
	
	public static void main(String[] args) {
		
		MultiExample1 multi = new MultiExample1();
		multi.start();
	}

}
