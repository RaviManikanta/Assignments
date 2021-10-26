/**
 * Performing required operations to ArrayList
 * using java8 created various methods performs various operations using Stream Api
 */
package com.yash.ems.service_implementation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import com.mysql.jdbc.Statement;
import com.yash.empjdbc.util.EmployeeUtil;

public class EmployeeServiceImp   
{

	 Logger log =Logger.getAnonymousLogger();
	 EmployeeUtil eu = new EmployeeUtil();

	public void getEmployeeList() throws SQLException 
	{
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

		 Statement st = (Statement)con.createStatement();
	        ResultSet rs = st.executeQuery("select * from empjdbc");
	        
	        while(rs.next()) {
	            log.info(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
	
	        }
	        con.close();       
	}
	
	//Performs sorting by Id
	public void getEmpSortId() throws SQLException
	{
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

		 Statement st = (Statement)con.createStatement();
	        ResultSet rs = st.executeQuery("select * from empjdbc order by id");
	        while(rs.next()) {
	            log.info(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
	        }
	        con.close(); 

	}

	//Perform sorting by salary
	public void getEmpSortSal() throws SQLException
	{
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

		 Statement st = (Statement)con.createStatement();
	        ResultSet rs = st.executeQuery("select * from empjdbc order by salary");
	        while(rs.next()) {
	            log.info(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
	        }
	        con.close(); 

	}
	//performing searching by location
    public void   getEmployeeLoc() throws SQLException
    {
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

		 Statement st = (Statement)con.createStatement();
	        ResultSet rs = st.executeQuery("select * from empjdbc where location = 'Hyd'");
	        while(rs.next()) {
	            log.info(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
	        }
	        con.close(); 
    }
    //performing searching by name
    public void getEmployeeName() throws SQLException {
    	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

		 Statement st = (Statement)con.createStatement();
	        ResultSet rs = st.executeQuery("select * from empjdbc where name = 'Anvesh'");
	        while(rs.next()) {
	            log.info(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
	        }
	        con.close(); 
    }


}
