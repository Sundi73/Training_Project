package com.lockedme;

import java.util.*;
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

				HandleOptions.handleMenuOption();
				break;
				
				case 3:
					System.out.println("Program Exited Successfully...");
					work = false;
					scan.close();
					System.exit(0);
					
				default:
					System.out.println("Please enter valid option...");
					HandleOptions.welcomeScreenInput();
				
				}
				
			}catch(Exception e) {
				System.out.println(e.getClass().getName());
				welcomeScreenInput();
			}
		}while(work == true);
	}
	
	public static void handleMenuOption() {
		boolean work = true;
		Scanner scan = new Scanner(System.in);
		
		try {
			MainMenuOptions.displayMenuOption();
			FileOperation.createMainFolderIfNotPresent("main");
			
			int input = scan.nextInt();
			switch(input) {
			case 1:
				System.out.println("Enter the file name to add in main folder");
				String newFileToAdd = scan.next();
				
				FileOperation.createFile(newFileToAdd);
				
				HandleOptions.handleMenuOption();
				break;
				
				
			case 2 :
				System.out.println("Enter name of file to delete");
				String fileToDelete = scan.next();
				
				//FileOperation.createMainFolderIfNotPresent("main");
				List<String> filesToDelete = FileOperation.fileLocation(fileToDelete, "main");
			
				int index = scan.nextInt();
				
				if(index!=0) {
					FileOperation.deleteFileRecursively(filesToDelete.get(index-1));
				} else {
					for (String path : filesToDelete) {
						FileOperation.deleteFileRecursively(path);
					}				
				}
				
				HandleOptions.handleMenuOption();
				
				break;
			case 3:
				System.out.println("Enter the name of file to be search");
				String fileName = scan.next(); 
				
				FileOperation.createMainFolderIfNotPresent(fileName);
				FileOperation.fileLocation(fileName, "main");
				
				HandleOptions.welcomeScreenInput();
				
				break;
				
			case 4:
				
				HandleOptions.welcomeScreenInput();
				break;
				
			case 5:
				System.out.println("Program Exited Successfully");
				work = false;
				scan.close();
				System.exit(0);
				
			default : 
				System.out.println("Please select valid option from above");
		}
			}catch(Exception e) {
			System.out.println(e.getClass().getName());
			handleMenuOption();
		}while(work == true);
	}
	
}
