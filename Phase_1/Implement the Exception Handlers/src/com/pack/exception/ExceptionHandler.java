package com.pack.exception;

public class ExceptionHandler {

	public static void main(String[] args) {
		
	int a[] = new int[4];
	try {
		a[4]= 10;
		
	}catch (Exception e) {
		System.out.println("Exception Hnadle by catch block");
		System.out.println(e.getMessage());
	}

	}

}
