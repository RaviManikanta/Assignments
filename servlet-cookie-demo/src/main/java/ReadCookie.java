

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				out.println("cookie--->"+cookie.getName()+", cookie value-->"+cookie.getValue());
			}
		}

		
//		for(int i=0; i<cookies.length;i++) {
//			out.println("cookie--->"+cookies[i].getName()+", cookie value-->"+cookies[i].getValue());
//		}
	}

}
