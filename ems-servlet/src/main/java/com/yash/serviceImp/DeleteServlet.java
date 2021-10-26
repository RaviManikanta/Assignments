package com.yash.serviceImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.model.Employee;
import com.yash.util.DatabaseConnection;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			Connection con = DatabaseConnection.getConnection();
			
			 String  name  = request.getParameter("name"); 
			PreparedStatement pt = con.prepareStatement( "DELETE FROM empservlet WHERE name='"+name+"'");
			pt.executeUpdate();
			
			
			List<Employee> list=EmployeeImp.getAllEmployees();
			out.println("<h1>Employee Record Deleted</h1>");
			out.print("<table border='1' width='100%'");
			out.print("<tr><th>Id</th><th>Name</th><th>Location</th><th>Number</th><th>Desegnstion</th><th>Salary</th></tr>");
			for (Employee employee : list) {
				out.print("<tr><td>"+employee.getId()+"</td><td>"+employee.getName()+"</td><td>"+employee.getLocation()+"</td><td>"+employee.getNumber()+"</td><td>"+employee.getDesegnstion()+"</td><td>"+employee.getSalary());
			}
			
			out.print("</table>");
			out.close();
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
