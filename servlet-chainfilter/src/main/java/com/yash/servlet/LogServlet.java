package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	        String message = "This is your response from a POST call. <br> The response is a Java Servlet !";
	             
	     out.println(message+"<br>");
	        out.println("  <li><b>You entered the name </b>: "       + request.getParameter("name") + "\n" +
	             "  </li><li><b>You entered the telephone# </b>: " + request.getParameter("address") + "\n" +
	             "</li></ul>\n" +
	             "");
	        out.close();
	}

}
