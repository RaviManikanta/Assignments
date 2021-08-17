package com.yash.io.ass_fileIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayFileData
{
	public static void main(String[] input)
	{
		String line=null;
		try
		{
			/* FileReader reads text files in the default encoding */
			FileReader fr = new FileReader("F:\\Assignements\\ass-fileIO\\company\\basicinfo.txt");

			/* always wrap the FileReader in BufferedReader */
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
