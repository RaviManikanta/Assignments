package com.yash.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class EmpService 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	String sql = "insert into empservlet(name,id,location,number,desegnation,salary) values(?,?,?,?,?,?)";
	PreparedStatement pstmnt = (PreparedStatement) con.prepareStatement(sql);
	
	pstmnt.setString(1, "anuj");
	pstmnt.setInt(2, 104);
	pstmnt.setString(3,"Indore");
	pstmnt.setString(4, "9493577770");
	pstmnt.setString(5, "sr.manager");
	pstmnt.setDouble(6, 23000);
	pstmnt.addBatch();
	
	
	pstmnt.setString(1, "anvesh");
	pstmnt.setInt(2, 102);
	pstmnt.setString(3,"Hyd");
	pstmnt.setString(4, "9493578911");
	pstmnt.setString(5, "sr.manager");
	pstmnt.setDouble(6, 50000);
	pstmnt.addBatch();
	
	pstmnt.setString(1, "dharmesh");
	pstmnt.setInt(2, 103);
	pstmnt.setString(3,"Pune");
	pstmnt.setString(4, "9493578912");
	pstmnt.setString(5, "manager");
	pstmnt.setDouble(6, 23000);
	pstmnt.addBatch();
	
	pstmnt.executeBatch(); 
	
}
}
