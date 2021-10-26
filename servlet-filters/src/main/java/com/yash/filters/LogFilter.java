package com.yash.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
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
		log.info("----------------------");
		log.info("inti method is called in"+this.getClass().getName());
		log.info("------------------");
	}



	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		
		log.info("dofilter method called in "+this.getClass().getName());
	
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		
		String ipAddress = req.getRemoteAddr();
		String path = req.getPathInfo();
		long date = req.getDateHeader(ipAddress);
		
		log.info("IP"+ipAddress+"path info"+path+"date"+date);
		out.println("logfilter is invoked before<br>");
		
		chain.doFilter(request, response);
		out.println("Logfilter is invoked after<br>");
	}
	
	
	
	public void destroy() {
		log.info("--------------------------");
		log.info("destroy method is called in"+this.getClass().getName());
		log.info("---------------------------");
	}



}
