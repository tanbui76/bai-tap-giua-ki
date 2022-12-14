package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.PermissionDAO;

@WebServlet("/AddPermissionServlet")
public class AddPermissionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idPhanQuyen = request.getParameter("txtIDPhanQuyen");
		String PhanQuyen = request.getParameter("txtPhanQuyen");
		String tenModule =request.getParameter("txtTenModule");
		String icon = "";
		String linkForm = request.getParameter("txtLinkForm");
		PermissionDAO permissionDAO = new PermissionDAO();
		
		if (permissionDAO.AddPermissionServlet(idPhanQuyen,Integer.parseInt(PhanQuyen), tenModule,linkForm)==1) {
			response.sendRedirect("PermissionDataServlet?msg=AddSucc()");
		 }else {
			 response.sendRedirect("PermissionDataServlet?msg=AddErr()");
		}
		 
	}

}
