package com.pack;

public class methodOverriding extends parent {

	public void A(String name) {
		System.out.println(name+" have 4 cars");
	}
	public static void main(String[] args) {
		
		methodOverriding m = new methodOverriding();
		m.A("Rakesh");

	}

}

class parent{
	public void A(String name) {
		System.out.println(name+" have 2 cars");
	}
}
