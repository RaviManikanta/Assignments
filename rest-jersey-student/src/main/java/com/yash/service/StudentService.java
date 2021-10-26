package com.yash.service;

import java.util.ArrayList;
import com.yash.model.Student;

public class StudentService
{
	public static ArrayList<Student> stud = new ArrayList<Student>();
	static 
	{
		stud.add(new Student(1,"Anvesh","Hyd"));
		stud.add(new Student(2,"Ravi","Hyd"));
		stud.add(new Student(3,"Dharmesh","Indore"));
		stud.add(new Student(4,"Anuj","Pune"));	
	}
}
