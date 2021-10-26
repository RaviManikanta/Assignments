package com.yash.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter("/LogFilter")
public class LogFilter implements Filter {
	Logger log =Logger.getAnonymousLogger();

	public void init(FilterConfig fConfig) throws ServletException {
	log.info("--------------intimethod called---------------");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
        
	
        String servletPath = req.getServletPath();
        String remoteAddr = request.getRemoteAddr();
  
        log.info(" ");
        log.info("Logging Date: " + new Date());
        log.info("Servlet path: " + servletPath );
       log.info("Call from : " + remoteAddr);
       // pass the request along the filter chain
       chain.doFilter(request, response);
       
       
       
       
       PrintWriter out=response.getWriter();  
       
       String password=req.getParameter("password");  
       if(password.equals("admin")){  
       chain.doFilter(req, response);//sends request to next resource  
       }  
       else{  
       out.print("username or password error!");  
       RequestDispatcher rd=req.getRequestDispatcher("admin.html");  
       rd.include(req, response);  
       }  

	}

	
	
	


	public void destroy() {
		log.info("-------------------destroy method is called-------------------");

	}

}
