package com.package1;

public class priAccess {

	public static void main(String[] args) {
		
		privateAccess pa = new privateAccess();
	System.out.println(pa.value); //Shows Compile Time error.
		pa.display();//Shows Compile Time error.

	}

}

class privateAccess{

	private int value = 100; 
	private void display() {
		System.out.println("Hello Private"); 
	}
}

//Access to private modifier is limited within a class....