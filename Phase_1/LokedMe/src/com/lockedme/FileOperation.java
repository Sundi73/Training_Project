package com.lockedme;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileOperation {

	public static void createMainFolderIfNotPresent(String fName) {
		File file = new File(fName);
		
		// if file doesn't exist, Create the main folder.
		if(!file.exists())
			file.mkdir();
		
	}
	
	public static void displayAllFiles(String path) {
		FileOperation.createMainFolderIfNotPresent("main");
		
		System.out.println("Displaying all files with directory structure in ascending order\n");

		List<String> filesListNames = FileOperation.listFilesInDirectory(path, 0, new ArrayList<String>());

		System.out.println("Displaying all files in ascending order\n");
		Collections.sort(filesListNames);

		filesListNames.stream().forEach(System.out::println);
	}
	
	public static List<String> listFilesInDirectory(String path, int indentationCount, List<String> fileListNames) {
		File dir = new File(path);
		File[] files = dir.listFiles();
		List<File> filesList = Arrays.asList(files);

		Collections.sort(filesList);

		if (files != null && files.length > 0) {
			for (File file : filesList) {

				

				if (file.isDirectory()) {
					System.out.println("`-- " + file.getName());

					
					fileListNames.add(file.getName());
					listFilesInDirectory(file.getAbsolutePath(), indentationCount + 1, fileListNames);
				} else {
					System.out.println("|-- " + file.getName());
					fileListNames.add(file.getName());
				}
			}
		} else {
			System.out.println("Empty Directory");
		}
		System.out.println();
		return fileListNames;
	}
	
	
}
