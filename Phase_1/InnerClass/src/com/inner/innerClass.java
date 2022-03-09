package com.inner;

public class innerClass {

	int data = 100;
	void dog() {
		System.out.println("Dog is pet animal");
	}
	class Examle{
		void msg() {
			System.out.println("the outer class data member : "+data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClass inner = new innerClass();
		inner.dog();
		innerClass.Examle example = inner.new Examle();
		example.msg();
		

	}

}
