package com.lockedme;

public class MainMenuOptions {
	public static void welcomeScreen(String appName,String developerName) {
		
		String companyName = String.format("-----------------------"
		+"Welcome to %s.com ----------------\n"+"This application was developed by %s.\n\n"
		,appName,developerName);
		
		String appFunction = "This application perform following Operatiop :-\n\n"
				+"Retrieve all file name in the main folder\n"+
				"Search, add or delete files in main folder";
		
		System.out.println(companyName);
		
		System.out.println(appFunction);
	}
	
	
	public static void displayMenu() {
		String menu = "\n\n--------Select any option number and press enter---------"
				+"\n1. Retrieve all files inside main folder.\n" + "2. Display menu for file opertion.\n"
				+ "3. Exit Program.\n";
		System.out.println(menu);
	}
	

	public static void displayMenuOption() {
		
		String menu = "\n\n -------Select any option number and press enter------\n\n"+
		"1. Add file to main folder.\n"+"2. Delete file from main folder.\n"+
				"3. Search for file from main folder.\n"+"4. Previous Menu.\n"+
		"5. Exit Program.";
		
		System.out.println(menu);
		
	}
}
