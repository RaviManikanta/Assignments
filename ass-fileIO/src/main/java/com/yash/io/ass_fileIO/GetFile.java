package com.yash.io.ass_fileIO;

import java.io.File;
import java.io.FilenameFilter;

public class GetFile 
{
	public static void main(String[] args) {
		
		File directoryPath = new File("F:\\Assignements\\ass-fileIO\\company");
		System.out.println("\n------------Text files------------");
		
		File[] files=directoryPath.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});

		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}
