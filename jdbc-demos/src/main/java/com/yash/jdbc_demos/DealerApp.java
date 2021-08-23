package com.yash.jdbc_demos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

 

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

 

public class DealerApp {

 

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Logger log = Logger.getAnonymousLogger();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Dealerdb","root","root");
        log.info("Database connected");
        //create table
//        String create = "create table dealerDetails(reg_num int,shop_name varchar(30),owner_name varchar(30),product varchar(30))";
//        PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(create);
//        pstmt.execute();
//        log.info("table created: ");
        
        //update table
        
//        String insert = "insert into dealerDetails(reg_num,shop_name,owner_name,product) values(?,?,?,?)";
//        PreparedStatement pstmt1 = (PreparedStatement) con.prepareStatement(insert);
//        pstmt1.setInt(1, 101 );
//        pstmt1.setString(2, "carWorld");
//        pstmt1.setString(3, "Ravi");
//        pstmt1.setString(4, "tyres");
//        pstmt1.addBatch();
//        
//        pstmt1.setInt(1, 102 );
//        pstmt1.setString(2, "atozCars");
//        pstmt1.setString(3, "Anvesh");
//        pstmt1.setString(4, "body");
//        pstmt1.addBatch();
//        
//        pstmt1.setInt(1, 103 );
//        pstmt1.setString(2, "carZone");
//        pstmt1.setString(3, "Anuj");
//        pstmt1.setString(4, "lights");
//        pstmt1.addBatch();
//        
//        pstmt1.setInt(1, 104 );
//        pstmt1.setString(2, "raviCars");
//        pstmt1.setString(3, "Dharmesh");
//        pstmt1.setString(4, "seats");
//        pstmt1.addBatch();
//        
//        pstmt1.setInt(1, 105 );
//        pstmt1.setString(2, "avCars");
//        pstmt1.setString(3, "Aishwary");
//        pstmt1.setString(4, "airBags");
//        pstmt1.addBatch();
//        pstmt1.executeBatch();
    
        /* Delete operation*/
        
//        String delete = "delete from dealerDetails where reg_num=101";
//        PreparedStatement pstmt2 = (PreparedStatement) con.prepareStatement(delete);
//        pstmt2.execute();
//        log.info("row deleted: ");
        
        /* Read operation*/
        
        //String print ="select * from dealerDetails";
//        PreparedStatement pstmt3 = (PreparedStatement) con.createStatement();
        Statement st = (Statement) con.createStatement();
        ResultSet rs = st.executeQuery("select * from dealerDetails");
        while(rs.next()) {
            log.info(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }
        
        log.info("executed");
    
        
    }

 

}