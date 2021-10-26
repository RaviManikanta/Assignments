package com.yash.serviceImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.model.Employee;
import com.yash.util.DatabaseConnection;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement pt = con.prepareStatement("insert into empservlet values(?,?,?,?,?,?)");
			
			pt.setString(1, request.getParameter("name"));
			pt.setInt(2, Integer.valueOf(request.getParameter("id")));
			pt.setString(3, request.getParameter("location"));
			pt.setString(4, request.getParameter("number"));
			pt.setString(5, request.getParameter("desegnation"));
			pt.setDouble(6, Double.valueOf(request.getParameter("salary")));
			pt.executeUpdate();
			pt.close();
			con.close();
			PrintWriter out = response.getWriter();
			out.println("<h1><b>Successfully Inserted"+"</b></h1><br><br>");
			
			
			out.println("<h3><b>Employee list after update"+"</b></h3><br>");
			List<Employee> list=EmployeeImp.getAllEmployees();
			out.print("<table border='1' width='100%'");
			out.print("<tr><th>Id</th><th>Name</th><th>Location</th><th>Number</th><th>Desegnstion</th><th>Salary</th></tr>");
			for (Employee employee : list) {
				out.print("<tr><td>"+employee.getId()+"</td><td>"+employee.getName()+"</td><td>"+employee.getLocation()+"</td><td>"+employee.getNumber()+"</td><td>"+employee.getDesegnstion()+"</td><td>"+employee.getSalary());

			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
