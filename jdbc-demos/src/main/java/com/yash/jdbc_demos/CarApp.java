package com.yash.jdbc_demos;
/**
 * project performs CURD operations in carApp Database
 */

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;

public class CarApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Logger log = Logger.getAnonymousLogger();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/carShop","root","root");
			log.info("database connected");
			Statement st = (Statement) con.createStatement();
			
			ResultSet rs= st.executeQuery("SELECT *from cardetails");
			ResultSet rs1= st.executeQuery("SELECT *from enginedetails");
			



			/*-------------------performing CURD operations--------------------*/


			/*---------------------CREATING TABLE-----------------------------*/

			// st.execute("CREATE TABLE carDetails(reg_num int,ownerName varchar(30),type varchar(20),engine varchar(20))");		
			// log.info("table created");

			/*-----------------------UPDATING TABLE VALUES---------------------*/
			// st.executeUpdate("INSERT INTO carDetails values (101,'anvesh','Maruthi','VDI')");
			// st.executeUpdate("INSERT INTO carDetails values (102,'ravi','hundai','1.4 L 5')");
			//log.info("values added");




			/*--------------------------------READING FROM TABLE-----------------------*/
			
				ResultSet rs2 = st.executeQuery("SELECT * FROM cardetails where type = 'maruthi'");
			while(rs2.next())
			{		
				log.info(rs2.getInt(1)+", "+rs2.getString(2)+", "+rs2.getString(3)+", "+rs2.getString(4));       	
			}
			

			/*---------------------------DELETE FROM TABLE-------------------------------------*/
			// st.execute("DELETE FROM  enginedetails WHERE reg_num = 104");
			//  log.info("value deleted");

			//       while(rs1.next())
			//       {
			//    	   
			//      	log.info(rs1.getInt(1)+", "+rs1.getDate(2)+", "+rs1.getString(3)); 
			//      	
			//       }
			//  
			
			
		}//try

		catch(Exception e){
			System.out.println(e);

		}



	}

}
