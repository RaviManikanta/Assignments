

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fibonacci
 * @param <FibonacciSeries>
 */
@WebServlet("/Fibonacci")
public class Fibonacci extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
  
	
	protected void sevice(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
	    FibonacciSeries();
		
		//FibonacciSeries fi = new FibonacciSeries();
       // out.println("<html><body><form>"+fi+"</form></body></html>");
	
		
	}


 static void  FibonacciSeries() {  
	  
	 int n1=0,n2=1,n3,i,count=10;    
	   
	 for(i=2;i<count;++i)
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }
 
	}
}
