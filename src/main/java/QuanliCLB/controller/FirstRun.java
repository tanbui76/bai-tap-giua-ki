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

import QuanliCLB.dao.LoginDAO;
import QuanliCLB.model.TaiKhoan;

@WebServlet("/FirstRun")
public class FirstRun extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        HttpSession session = request.getSession();
        LoginDAO dao = new LoginDAO();
        if (cookies[0].getValue() != "" ) {
        	TaiKhoan tk = dao.isLogin(cookies[0].getValue(),cookies[1].getValue());
        	session.setAttribute("tk", tk);
        	RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
			rd.forward(request, response);
        } else {
        	RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        HttpSession session = request.getSession();
        LoginDAO dao = new LoginDAO();
        if (cookies.length > 0 ) {
        	TaiKhoan tk = dao.isLogin(cookies[0].getValue(),cookies[1].getValue());
        	session.setAttribute("tk", tk);
        	RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
			rd.forward(request, response);
        } else {
        	RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
        }
        
	}

}
