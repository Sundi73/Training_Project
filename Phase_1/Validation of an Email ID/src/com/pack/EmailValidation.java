package com.pack;
import java.util.*;


public class EmailValidation {
	
	public static boolean searchEmail(String email,String emails[]) {
		boolean flag = false;
		for(int i=0;i<emails.length;i++) {
			if(email.equalsIgnoreCase(emails[i])) {
				flag = true;
				
			}
				
		}
		return flag;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String email[] = {"ashutosh@gmail.com","alex@gmail.com","Karan@yahoo.in","peter@hotmail.com","Sachin@yahoo.in"};
		
		System.out.println("Enter the email");
		
		String search = scanner.next();
		
		if(searchEmail(search, email)) {
			System.out.println("EmailId is present");
		}
		else {
			System.out.println("EmailId is not present");
		}
		
		scanner.close();

	}

}
