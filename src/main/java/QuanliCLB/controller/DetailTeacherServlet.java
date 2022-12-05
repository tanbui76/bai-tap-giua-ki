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

import QuanliCLB.dao.TeacherListDAO;
import QuanliCLB.model.GiaoVien;

@WebServlet("/DetailTeacherServlet")
public class DetailTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TeacherListDAO listDAO = new TeacherListDAO();
		HttpSession session = request.getSession();
		try {
			List<GiaoVien> list = listDAO.getTeacherList();
			session.setAttribute("list", list);
			RequestDispatcher rDispatcher = request.getRequestDispatcher("TeacherList.jsp");
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
