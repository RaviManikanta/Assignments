package com.yash.serviceImp;

import com.mysql.jdbc.Connection;

import com.yash.model.Employee;
import com.yash.util.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EmployeeImp
{
	public static List<Employee> getAllEmployees(){
		List<Employee> list=new ArrayList<Employee>();
		
		try{
			
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from empservlet");
			ResultSet rs=ps.executeQuery();
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
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
}
