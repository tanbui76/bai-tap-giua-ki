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
import QuanliCLB.dao.StudentListDAO;
import QuanliCLB.model.SinhVien;
import QuanliCLB.model.TaiKhoan;

/**
 * Servlet implementation class StudentListServlet
 */
@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentListDAO sListDAO = new StudentListDAO();
		AccountDAO accountDAO = new AccountDAO();
		HttpSession session = request.getSession();
		try {
			List<SinhVien> list = sListDAO.getStudenList();
			List<TaiKhoan> tKhoans = accountDAO.getTaiKhoan();
//			String matutangString = sListDAO.Matutang();
			session.setAttribute("list",list);
			session.setAttribute("tklist", tKhoans);
//			session.setAttribute("matutang", matutangString);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("StudentList.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
