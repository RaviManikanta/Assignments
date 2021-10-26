import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	protected static Connection initializeDatabase()
			throws SQLException, ClassNotFoundException
		{
			// Initialize all the information regarding
			// Database Connection
			Class.forName ( "com.mysql.jdbc.Driver");
			
//			 Connection  con=DriverManager.getConnection
//                     ("jdbc:mysql://localhost:3306/employee","root","root");
//			
			String dbURL = "jdbc:mysql:// localhost:3306/";
			// Database name to access
			String dbName = "employee";
			String dbUsername = "root";
			String dbPassword = "root";

		
			Connection con = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword);
			return con;
		}

}
