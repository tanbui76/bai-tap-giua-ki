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

import QuanliCLB.dao.ScoreStudentDAO;
import QuanliCLB.model.BangDiemPhu;


@WebServlet("/ScoreStudentServlet")
public class ScoreStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ScoreStudentDAO sDao = new ScoreStudentDAO();
		HttpSession session = request.getSession();
		try {
			List<BangDiemPhu> list = sDao.getBangDiemPhu();
			RequestDispatcher rDispatcher = request.getRequestDispatcher("Score.jsp");
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
