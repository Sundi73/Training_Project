package com.pack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class filehandlingmechanism {

	public static void main(String[] args) {
		//file is created
		File file = new File("src/first.txt");
		
		try {
			file.createNewFile();
			System.out.println("New file is Created");
			
			//here  we are updating a file......
			FileWriter fw = new FileWriter(file,true);
			fw.write("This is java program\n");
			fw.close();
			System.out.println("-----------------");
			
			FileReader reader = new FileReader(file);
			int i = 0;
			while((i=reader.read())!= -1) 
				System.out.print((char)i);
				reader.close();
			//delete file
				
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
