

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvenOdd
 */
@WebServlet("/EvenOdd")
public class EvenOdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 PrintWriter out = response.getWriter();     
	        response.setContentType("text/html");	         
	      
	        
	        out.println("even numbers"+"<br>");
	        for(int i=1;i<=100;i++)    
	        {    
	            if(i%2==0)    
	            {    
	            	
	                out.println(i+"<br>");    
	            }   
	          
	        }    
	          
	        out.println("odd numbers"+"<br>");
	        for(int j=1;j<=100;j++)
	        {
	        	if(j%2!=0)
	        	{
	        		
	        	out.println(j+"<br>");
	        	}
	        }
	        
	        out.close();    
	            
	}

}
