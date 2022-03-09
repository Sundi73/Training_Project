package com.pack.multi;

public class MultiExample2 implements Runnable{

	public static int count = 0;
	
	public void run() {
			System.out.println("run() count value " + MultiExample2.count);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiExample2 me = new MultiExample2();
		Thread td = new Thread(me);
		td.start();
		
		System.out.println("Main() Count value "+count);

	}

}
