package com.pack.abstraction;

public abstract class BankImp1 implements IBank {

	@Override
	public void deposit() {

		System.out.println("Deposit successfully done");

	}

	
	public abstract  void withdraw();
	
}
