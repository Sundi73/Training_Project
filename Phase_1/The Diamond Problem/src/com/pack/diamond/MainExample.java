package com.pack.diamond;

public class MainExample implements first , second {

	public void show() {
		first.super.show();
		second.super.show();
	}
	
	public static void main(String[] args) {
	

		MainExample m= new MainExample();
		m.show();
	}

}
