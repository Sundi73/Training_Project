package com.pack;

import java.util.Scanner;

public class calculator {
	
	public void cal(String n, double a,double  b) {
		switch(n) {
		case"+":
			System.out.println((a + b) );
			break;
		
		case"-":
			System.out.println((a - b) );
			break;
	
		case"*":
			System.out.println((a * b) );
			break;

		case"/":
			System.out.println((a / b) );
			break;
			
		default:
			System.out.println("ERR");
}
		
	}

	public static void main(String[] args) {
		
		calculator op = new calculator();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------Calculator------");
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		String s = scan.next();
		
		op.cal(s, x, y);
		
		scan.close();

	}

}
