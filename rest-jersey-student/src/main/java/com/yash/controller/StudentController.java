package com.yash.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.model.Student;
import com.yash.service.StudentService;
import com.yash.serviceImpl.StudentServiceImpl;
@Path("/student")
public class StudentController
{
	StudentServiceImpl si= new StudentServiceImpl();
	StudentService ss = new StudentService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getAllStudents() {
		List listOfStudents = si.getAllStudents();
		return listOfStudents;
		
	}
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)

	
	
}
