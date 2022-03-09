package com.pack.keywordcustom;

import java.io.IOException;

public class throwsExample {
	
	
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  

	  public static void main(String[] args) {
		throwsExample obj = new throwsExample();
		obj.p();
		System.out.println("noormal flow");
	}
}
