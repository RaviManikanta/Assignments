package com.yash.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DatabaseConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection con=null;		
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		return con;
	}
}
