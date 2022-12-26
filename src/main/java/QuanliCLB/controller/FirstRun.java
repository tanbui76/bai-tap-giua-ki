package QuanliCLB.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.If;

import QuanliCLB.dao.HomePageDAO;
import QuanliCLB.dao.LoginDAO;
import QuanliCLB.model.Admin;
import QuanliCLB.model.GiaoVien;
import QuanliCLB.model.SinhVien;
import QuanliCLB.model.TaiKhoan;

@WebServlet("/FirstRun" )
public class FirstRun extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession ();
		if (session.getAttribute("admin") != null || session.getAttribute("sinhvien") != null
				|| session.getAttribute("giaovien") != null) {
			RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
			rd.forward(request, response);

		} else {

			Cookie cookie = null;
			HomePageDAO homePageDAO = new HomePageDAO();
			Cookie[] cookies = null;
			List<Cookie> getCookies = new ArrayList<Cookie>();
			cookies = request.getCookies();
			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				System.out.println(cookie.getName() + " " + cookie.getValue());
				if (cookies[i].getName().equals("username") || cookies[i].getName().equals("password")) {
					getCookies.add(cookie);
				}
			}

			LoginDAO dao = new LoginDAO();
			Cookie usernameCookie = null;
			Cookie passwordCookie = null;
			if (getCookies.isEmpty() != true) {
				for (int i = 0; i < getCookies.size(); i++) {
					if (cookies[i].getName().equals("username")) {
						usernameCookie = getCookies.get(i);
						System.out.println(usernameCookie.getValue());
					}
					if (cookies[i].getName().equals("password")) {
						passwordCookie = getCookies.get(i);
						System.out.println(passwordCookie.getValue());
					}
				}
				TaiKhoan tk = dao.isLogin(usernameCookie.getValue(), passwordCookie.getValue());
				if (tk.getPhanQuyen() == 1) {
					Admin admin = (Admin) homePageDAO.getAdmin(tk);
					session.setAttribute("admin", admin);
				}
				if (tk.getPhanQuyen() == 3) {
					SinhVien sinhvien = (SinhVien) homePageDAO.getSinhVien(tk);
					session.setAttribute("sinhvien", sinhvien);
				}
				if (tk.getPhanQuyen() == 2) {
					GiaoVien giaoVien = (GiaoVien) homePageDAO.getGiaoVien(tk);
					session.setAttribute("giaovien", giaoVien);
				}
				session.setAttribute("tk", tk);
				RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
