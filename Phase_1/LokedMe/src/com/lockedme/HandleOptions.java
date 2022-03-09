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
				
				FileOperation.createFile(newFileToAdd, scan);
				break;
				
			case 2 :
				System.out.println("Enter name of file to delete");
				String fileToDelete = scan.next();
				
				FileOperation.createMainFolderIfNotPresent("main");
				List<String> filesToDelete = FileOperation.fileLocation(fileToDelete, "main");
				
				String deletionMsg = "\n Select index of file to delete."
				+"\n Enter 0 to delete all file";
				System.out.println(deletionMsg);
				
				int index = scan.nextInt();
				
				if(index!=0) {
					FileOperation.deleteFileRecursively(filesToDelete.get(index-1));
				} else {
					for (String path : filesToDelete) {
						FileOperation.deleteFileRecursively(path);
					}				
				}
				break;
				
			case 3:
				System.out.println("Enter the name of file to be search");
				String fileName = scan.next();
				
				FileOperation.createMainFolderIfNotPresent(fileName);
				FileOperation.fileLocation(fileName, "main");
			}
			}catch(Exception e) {
			System.out.println(e.getClass().getName());
			handleMenuOption();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
