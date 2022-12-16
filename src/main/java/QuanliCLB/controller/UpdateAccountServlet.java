package QuanliCLB.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.AccountDAO;

@WebServlet("/UpdateAccountServlet")
public class UpdateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String IdTaiKhoan = request.getParameter("txtIDTaiKhoanUpdate");
		String tenDangNhap = request.getParameter("txtTenDangNhapUpdate");
		String phanQuyen = request.getParameter("txtphanQuyenUpdate");
		//int phanQuyenInt = Integer.parseInt(phanQuyen);
		System.out.println(IdTaiKhoan);
		System.out.println(tenDangNhap);
		System.out.println(phanQuyen);
		AccountDAO accountDAO = new AccountDAO();
		System.out.println("vô");
		
		if(accountDAO.UpdateAccount(IdTaiKhoan,tenDangNhap,Integer.parseInt(phanQuyen))==1) {
			response.sendRedirect("AccountServlet?msg=successUpdate()");
		}
		else
		{
			response.sendRedirect("AccountServlet?msg=failUpdate()");
		}
	
		
		
		
		
	}

}
