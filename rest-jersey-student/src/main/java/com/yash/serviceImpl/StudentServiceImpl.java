package com.yash.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.yash.model.Student;
import com.yash.service.StudentService;

public class StudentServiceImpl 
{
	public ArrayList <Student> stud= new ArrayList<Student>();

	public List<Student> getAllStudents() {
		stud.add(new Student(1,"Ravi","Hyd"));
		stud.add(new Student(2,"Anvesh","Hyd"));
		stud.add(new Student(3,"Dharmesh","Indore"));
		stud.add(new Student(4,"Anuj","Pune"));
		
		return stud;
	}

	public List<Student> addStudent(Student st) {
		stud.addAll(stud);
		stud.add(st);
		return stud;
	}

	public List<Student> updateStudent() {
		// TODO Auto-generated method stub
		return stud;
	}

	public List<Student> deleteStudent() {
		// TODO Auto-generated method stub
		return stud;
	}




}
