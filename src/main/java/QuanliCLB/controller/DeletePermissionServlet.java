package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.PermissionDAO;
import QuanliCLB.dao.StudentListDAO;

@WebServlet("/DeletePermissionServlet")
public class DeletePermissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idPhanQuyen = request.getParameter("txtIDPhanQuyenDelete");
		System.out.println(idPhanQuyen);
		
		PermissionDAO permissionDAO = new PermissionDAO();

		if(permissionDAO.DeletePermission(idPhanQuyen)==1) {
			response.sendRedirect("PermissionDataServlet?msg=successDelete()");
		}
		else {
			response.sendRedirect("PermissionDataServlet?msg=failDelete()");
		}
	}
}
