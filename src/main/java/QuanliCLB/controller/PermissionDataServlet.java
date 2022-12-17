package QuanliCLB.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import QuanliCLB.dao.PermissionDAO;
import QuanliCLB.model.BangDiemPhu;
import QuanliCLB.model.Permission;


@WebServlet("/PermissionDataServlet")
public class PermissionDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PermissionDAO dao = new PermissionDAO();
		HttpSession session = request.getSession();
		try {
			List<Permission> listSt = dao.getPermissionStudentList();
			List<Permission> listTc = dao.getPermissionTeacherList();
			session.setAttribute("listTc", listTc);
			session.setAttribute("listSt", listSt);
			RequestDispatcher rDispatcher = request.getRequestDispatcher("PermissionManager.jsp");
			rDispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
