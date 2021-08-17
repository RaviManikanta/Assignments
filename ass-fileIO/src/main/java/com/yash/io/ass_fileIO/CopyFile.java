package com.yash.io.ass_fileIO;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile 
{
	public static void main(String[] args)
	{
		try 
		{
			FileReader fr = new FileReader("file1.txt");
			FileWriter fw = new FileWriter("file2.txt");
			String str = "";
			int i;
			while ((i = fr.read()) != -1) 
			{
				str += (char)i;
			}
			System.out.println(str);
			fw.write(str);
			fr.close();
			fw.close();
			System.out.println("File reading and writing both done");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}

