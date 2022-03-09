package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {

		MainMenuOptions.welcomeScreen("LockedMe", "Ashutosh Tiwari");
	
		// Create "main" folder if not present
		FileOperation.createMainFolderIfNotPresent("main");

		HandleOptions.welcomeScreenInput();
	}

}
