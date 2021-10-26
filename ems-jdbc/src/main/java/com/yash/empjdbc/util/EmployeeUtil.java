package com.yash.empjdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.PreparedStatement;


public class EmployeeUtil

{public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

}
}
