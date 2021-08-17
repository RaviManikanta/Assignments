package com.yash.io.ass_fileIO;

import java.io.File;

public class CheckingFileCLA
{
	public static void main(String args[]) {
		//accept file name or directory name through command line args
		String fname =args[0];

		//pass the filename or directory name to File object
		File f = new File(fname);

		//apply File class methods on File object
		System.out.println("File name :"+f.getName());
		System.out.println("Path: "+f.getPath());
		System.out.println("Absolute path:" +f.getAbsolutePath());
		System.out.println("Parent:"+f.getParent());
		System.out.println("Exists :"+f.exists());
	}
}
