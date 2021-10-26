

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletJdbc")
public class ServletJdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
	            PreparedStatement pt = con.prepareStatement("insert into servlet values(?, ?)");
	  
	
	            pt.setInt(1, Integer.valueOf(request.getParameter("id")));	  
	            pt.setString(2, request.getParameter("name"));
	  
	            pt.executeUpdate();
	  
	            pt.close();
	            con.close();
	  
	            PrintWriter out = response.getWriter();
	            out.println("<html><body><b>Successfully Inserted" + "</b></body></html>");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
