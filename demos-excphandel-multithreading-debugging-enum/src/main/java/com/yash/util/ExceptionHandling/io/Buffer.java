package com.yash.util.ExceptionHandling.io;
import java.io.*;

public class Buffer {

	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("hello.txt");
				BufferedInputStream bin = new BufferedInputStream(fin);

				FileOutputStream fout = new FileOutputStream("hello2.txt");
				BufferedOutputStream bout = new BufferedOutputStream(fout);)
		{
			String s = "this is buffer write.";
			byte b[]=s.getBytes();
			bout.write(b);
			int i=0;
			while((i=bin.read())!=-1)
				System.out.println((char)i);
			bout.flush();

		}
		catch(Exception e)
		{
			System.out.println(e);   
		}
	}

}
