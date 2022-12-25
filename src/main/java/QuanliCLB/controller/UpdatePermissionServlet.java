package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.PermissionDAO;

@WebServlet("/UpdatePermissionServlet")
public class UpdatePermissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idPhanQuyen = request.getParameter("txtIDPhanQuyenUpdate");
		String PhanQuyen = request.getParameter("txtPhanQuyenUpdate");
		String tenModule = request.getParameter("txtTenModuleUpdate");
		String linkForm = request.getParameter("txtLinkFormUpdate");
		PermissionDAO permissionDAO = new PermissionDAO();
		
		if (permissionDAO.UpDatePermission(idPhanQuyen, Integer.parseInt(PhanQuyen), tenModule, linkForm)==1) {
			response.sendRedirect("PermissionDataServlet?msg=successUpdate()");
		}
		else {
			response.sendRedirect("PermissionDataServlet?msg=failUpdate()");
		}
	}

}
