package com.lockedme;

import java.util.Scanner;

public class HandleOptions {
	public static void welcomeScreenInput() {
		boolean work = true;
		Scanner scan = new Scanner(System.in);
		do {
			try {
				MainMenuOptions.displayMenu();
				int input = scan.nextInt();
				
				switch(input) {
				case 1:
					FileOperation.displayAllFiles("main");
					break;
				case 2:
					//
				default:
					System.out.println();
				
				}
				
			}catch(Exception e) {
				System.out.println(e.getClass().getName());
				welcomeScreenInput();
			}
		}while(work == true);
		
		
		
	}

}
