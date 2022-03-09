package com.pack.file;

import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {

	public static void main(String[] args) {

		
		try {
		FileWriter fw = new FileWriter("J:\\File Handling.txt");
		fw.write("This file is created to store the important data");
		
		fw.append("Later this file is share with government");

		fw.close();
		
		FileReader fr = new FileReader("J:\\File Handling.txt");
		int i ;
		
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
			
		}
		fr.close();
		
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		
		System.out.print("\nFile Handling file successfully created ");
		System.out.print("\nFile Handling file successfully read");
		
	}

}
