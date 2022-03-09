package com.pack;

import java.util.Scanner;

public class arrayProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a[] = {10,20,30,40,50};

		for(int i:a) {
			System.out.println(i);
		}
		
		System.out.println("Enter the Dynamic array element");
		int arr[] = new int[3];
		for(int i = 0; i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		int[][]   ar = {
				 {2,4},
				{12,14},
				{22,24}
				};
		
		System.out.println(ar[0][1]);
		
		scanner.close();
		
	}
	
}
