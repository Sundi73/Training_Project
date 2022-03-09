package com.pack;

public class simpleConstructor {

	int id;
	String name,address;
	
	public simpleConstructor() {
		System.out.println("i'm in default constructor");
	}
	
	public simpleConstructor(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	
	void display() {
		System.out.println("id : "+id+" name : "+name+" address : "+address);
	}
	public static void main(String[] args) {
			simpleConstructor e = new simpleConstructor(); // this call default constructor
			simpleConstructor e1 = new simpleConstructor(101,"Ram","Noida"); //this initialize parameterize constructor
			e1.display();

	}

}
