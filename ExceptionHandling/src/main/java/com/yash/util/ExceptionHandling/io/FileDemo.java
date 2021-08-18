package com.yash.util.ExceptionHandling.io;
import java.io.*;

public class FileDemo {
	public static void main(String args[]) {
		try {
			File f = new File("hello.txt");
			System.out.println("file name "+f.getName()+
					"  file path:  "+f.getPath()+
					"  parent  "+f.getParent()+
					"  free space"+f.getFreeSpace()+
					"  length "+f.length());
			FileInputStream in = new FileInputStream(f);
			int i;
			while((i=in.read())!=-1)
				System.out.print((char)i);
			
			FileReader f1=new FileReader(f);
			while((i=f1.read())!=-1)
			System.out.println((char)i);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		

	}
}

