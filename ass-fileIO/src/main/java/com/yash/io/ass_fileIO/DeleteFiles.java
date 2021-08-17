package com.yash.io.ass_fileIO;

import java.io.File;

public class DeleteFiles {
	public static void main(String[] args) {
		String path="F:\\Assignements\\ass-fileIO\\fordelete"; 
		try 
		{
		File file = new File(path);
		File[] files = file.listFiles(); 
		for (File f:files) 
		{
			if (f.isFile() && f.exists()) 
		{
				f.delete();
		        System.out.println("successfully deleted");
		}
		}
		}
		catch(Exception e)
			{
			System.out.println(e);
	     	}
		}
	}
