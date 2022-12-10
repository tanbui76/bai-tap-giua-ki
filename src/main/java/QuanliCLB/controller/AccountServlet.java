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

import QuanliCLB.dao.AccountDAO;
import QuanliCLB.model.TaiKhoan;

@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountDAO aDao = new AccountDAO();
		HttpSession session = request.getSession();
		try {
			List<TaiKhoan> list = aDao.getTaiKhoan();
			session.setAttribute("list", list);
			RequestDispatcher rDispatcher = request.getRequestDispatcher("AccountManager.jsp");
			rDispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
