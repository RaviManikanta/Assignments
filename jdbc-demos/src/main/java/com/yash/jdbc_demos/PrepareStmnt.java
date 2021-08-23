package com.yash.jdbc_demos;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PrepareStmnt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Logger log =Logger.getAnonymousLogger();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		log.info("database connected");
        
		String sql = "insert into contact(name,phnum) values(?,?)";
		PreparedStatement pstmnt = (PreparedStatement) con.prepareStatement(sql);
		
		
		pstmnt.setString(1, "ravi");
		pstmnt.setString(2,"9090908765");
		pstmnt.addBatch();
		pstmnt.setString(1, "anvesh");
		pstmnt.setString(2,"9090908567");
		pstmnt.addBatch();
		pstmnt.setString(1, "anuj");
		pstmnt.setString(2,"9090908123");
		pstmnt.addBatch();
		pstmnt.setString(1, "darmesh");
		pstmnt.setString(2,"9090908000");
		pstmnt.addBatch();
		pstmnt.setString(1, "samuel");
		pstmnt.setString(2,"909095678");
		pstmnt.addBatch();
		pstmnt.executeBatch();
		//pstmnt.execute();
		log.info("value created");
		}

}
