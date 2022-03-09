package com.pack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileExample {

	public static void main(String[] args)  {
		
		try {
			Files.deleteIfExists(Paths.get("src/first.txt"));
			System.out.println("file deleted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
