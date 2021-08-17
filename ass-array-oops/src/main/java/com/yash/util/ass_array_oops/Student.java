package com.yash.util.ass_array_oops;

public class Student
{
	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName)
	{

		this.studentName=studentName;
		this.studentId=studentId;

	}



	public int getStudentId()
	{
		return this.studentId;
	}

	public String getStudentName()
	{
		return this.studentName;
	}


}