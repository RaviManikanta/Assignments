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
 * Servlet implementation class SortServlet
 */
@WebServlet("/SortServlet")
public class SortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> list=new ArrayList<Employee>();
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			Connection con = DatabaseConnection.getConnection();
			
			PreparedStatement pt = con.prepareStatement( "select * from empservlet ORDER BY name");
			ResultSet rs = pt.executeQuery();
			
			while(rs.next()){
				Employee e=new Employee();
				e.setName(rs.getString(1));
				e.setId(rs.getInt(2));
				e.setLocation(rs.getString(3));
				e.setNumber(rs.getString(4));
				e.setDesegnstion(rs.getString(5));
				e.setSalary(rs.getDouble(6));
				list.add(e);
				
			}
			out.println("<h1>Sorted Employees by name<h1>");
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
