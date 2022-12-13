package QuanliCLB.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.AccountDAO;


@WebServlet("/AddAccountServlet")
public class AddAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idTaiKhoan = request.getParameter("txtidTaiKhoan");
		String tenDangNhap =request.getParameter("txtTenDangNhap");
		String matKhau = request.getParameter("txtMatkhau");
		String phanQuyen = request.getParameter("txtphanQuyen");
		
		AccountDAO accountDAO = new AccountDAO();
		
		accountDAO.Insert(idTaiKhoan, tenDangNhap, matKhau, Integer.parseInt(phanQuyen));
		RequestDispatcher rDispatcher = request.getRequestDispatcher("AccountServlet");
		rDispatcher.forward(request, response);
//		response.sendRedirect("AccountServlet");
	}

}
