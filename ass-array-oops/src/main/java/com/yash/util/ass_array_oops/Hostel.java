package com.yash.util.ass_array_oops;
import java.util.Scanner;
public class Hostel
{   public static void main (String[] args) 
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student's Id:");
 	int studentId=sc.nextInt();
	sc.nextLine();

	System.out.println("Enter Student's Name:");
	String studentName=sc.nextLine();
}

void setDetails(int studentId,String studentName)
{
	this.studentId=studentId;
	this.studentName=studentName;
}

	
}

