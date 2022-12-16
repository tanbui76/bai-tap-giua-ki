package QuanliCLB.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		session.invalidate();
		Cookie cookie = null;
        Cookie[] cookies = null;
 
        cookies = request.getCookies();
        
        for (int i = 0; i < cookies.length; i++) {
            cookie = cookies[i];

            if ((cookie.getName()).compareTo("username") == 0) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
            if ((cookie.getName()).compareTo("password") == 0) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
		RequestDispatcher rsDispatcher = request.getRequestDispatcher("Login.jsp");
		rsDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
