package QuanliCLB.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import QuanliCLB.dao.HomePageDAO;
import QuanliCLB.dao.LoginDAO;
import QuanliCLB.model.Admin;
import QuanliCLB.model.TaiKhoan;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("txtEmail");
		String password = request.getParameter("txtPass");
		HttpSession session = request.getSession();
		LoginDAO loginDao = new LoginDAO();
		HomePageDAO homePageDAO = new HomePageDAO();
		System.out.println("runn1");
		TaiKhoan tk = loginDao.isLogin(username, password);
		if(tk.getPhanQuyen()== 1) {
			Admin admin = (Admin) homePageDAO.getAdmin(tk);
			session.setAttribute("admin", admin);
		}	
		session.setAttribute("tk", tk);
		
		if (tk == null) {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
			rd.forward(request, response);
		}
	}

}
