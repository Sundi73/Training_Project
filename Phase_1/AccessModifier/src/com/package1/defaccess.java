package com.package1;

public class defaccess {

	public static void main(String[] args) {
		
		defaultaccess df = new defaultaccess();
		df.display();
		
	}

}
//class having Default Access Modifier 

class defaultaccess{

	void display() {
		System.out.println("I am in default access modifier..");
	}
}
