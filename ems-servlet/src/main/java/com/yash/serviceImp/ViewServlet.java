package com.yash.serviceImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.mysql.jdbc.Driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.model.Employee;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Employees List</h1>");
		
		List<Employee> list=EmployeeImp.getAllEmployees();
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Id</th><th>Name</th><th>Location</th><th>Number</th><th>Desegnstion</th><th>Salary</th></tr>");
		for (Employee employee : list) {
			out.print("<tr><td>"+employee.getId()+"</td><td>"+employee.getName()+"</td><td>"+employee.getLocation()+"</td><td>"+employee.getNumber()+"</td><td>"+employee.getDesegnstion()+"</td><td>"+employee.getSalary());

		}
		out.print("</table>");
		out.close();
	
	}

}
