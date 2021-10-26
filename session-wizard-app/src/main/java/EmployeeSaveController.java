

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeSaveController
 */
@WebServlet("/EmployeeSaveController")
public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		response.setContentType("text/html");
		
		try {
			
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
	    Connection con = DatabaseConnection.initializeDatabase();
		PreparedStatement pt = con.prepareStatement("insert into empdetails values(?,?,?,?)");
			
			    pt.setString(1, (String)session.getAttribute("empName"));	          
	            pt.setString(2, (String)session.getAttribute("empContact"));
	            pt.setString(3, request.getParameter("email"));
	            pt.setString(4, request.getParameter("address"));
	  
	            pt.executeUpdate();
	  
	            pt.close();
	            con.close();
	  
	            out.println("<html><body><b>Successfully Inserted" + "</b></body></html>");
	

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}