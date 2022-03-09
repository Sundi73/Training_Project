package com.pack.abstraction;

import java.util.Scanner;

public class AtmMachineUser {

	public static void main(String[] args) {
			
		IBank  bank =	BankUtil.getObject();
		Scanner scanner  = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {

		System.out.println("$$$$$ WELCOME TO MY ATM  $$$$");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Exit");
		
		
		
		int choice = scanner.nextInt();
		
		
		
		switch (choice) {
		case 1:
			
			
				bank.deposit();
			
			break;

		case 2:
				//withdraw
			
				bank.withdraw();
			
			break;
		case 3:
				
				flag = false;
				
				System.out.println("Thank You , visit again..");
			
			break;
			
		default:
			break;
		}
		
		}
		
	}

}
