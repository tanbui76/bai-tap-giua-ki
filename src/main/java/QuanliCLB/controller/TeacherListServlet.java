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
import QuanliCLB.dao.TeacherListDAO;
import QuanliCLB.model.GiaoVien;
import QuanliCLB.model.TaiKhoan;

@WebServlet("/TeacherListServlet")
public class TeacherListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeacherListDAO tDao = new TeacherListDAO();
		AccountDAO aDao = new AccountDAO(); 
		HttpSession session = request.getSession();
		try {
			List<GiaoVien> list = tDao.getTeacherList();
			List<TaiKhoan> list2 = aDao.getTaiKhoan();
			session.setAttribute("list", list);
			session.setAttribute("tklist", list2);
			RequestDispatcher rDispatcher = request.getRequestDispatcher("TeacherList.jsp");
			rDispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
