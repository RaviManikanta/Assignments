package com.yash.jdbc_demos;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

 

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

 

public class ProductDetails {

 

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Logger log = Logger.getAnonymousLogger();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Dealerdb","root","root");
        log.info("Database connected");
        
        //create table
//        String create = "create table productDetails(prod_ID int,prod_name varchar(30),prod_desc varchar(30))";
//        PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(create);
//        pstmt.execute();
//        log.info("table created: ");
        
        //update table
        
//        String insert = "insert into productDetails(prod_ID,prod_name,prod_desc) values(?,?,?)";
//        PreparedStatement pstmt1 = (PreparedStatement) con.prepareStatement(insert);
//        pstmt1.setInt(1, 101 );
//        pstmt1.setString(2, "tyres");
//        pstmt1.setString(3, "mrf");
//    
//        pstmt1.addBatch();
//        
//        pstmt1.setInt(1, 102 );
//        pstmt1.setString(2, "body");
//        pstmt1.setString(3, "steal");
//    
//        pstmt1.addBatch();
//        
//        pstmt1.setInt(1, 103 );
//        pstmt1.setString(2, "light");
//        pstmt1.setString(3, "led");
//    
//        pstmt1.addBatch();
//        
//        pstmt1.setInt(1, 104 );
//        pstmt1.setString(2, "seats");
//        pstmt1.setString(3, "leather");
//    
//        pstmt1.addBatch();
//        
//        pstmt1.setInt(1, 105 );
//        pstmt1.setString(2, "airbags");
//        pstmt1.setString(3, "safety");
//    
//        pstmt1.addBatch();
//        
//        pstmt1.executeBatch();

 

        //read table
        
        Statement st = (Statement) con.createStatement();
        ResultSet rs = st.executeQuery("select * from productDetails");
        while(rs.next()) {
            log.info(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        
        log.info("executed");
    

 

    }

 

}