package com.search;
import java.util.*;

public class Linear {

	public void findElement(int a[], int key) {
		
		 int len = a.length;
		
		for(int i=0;i<len;i++) {
			if(a[i] == key)
				System.out.println("Key is present");
		}
		
	}
	
	public static void main(String[] args) {
		
		Linear l = new Linear();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the key you want to search");
		int k = scan.nextInt();
		
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		l.findElement(a, k);
	}

}
