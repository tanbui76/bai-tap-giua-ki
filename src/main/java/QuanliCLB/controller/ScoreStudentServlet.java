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
import QuanliCLB.dao.SemesterDao;
import QuanliCLB.dao.WeekDao;
import QuanliCLB.dao.YearDao;
import QuanliCLB.model.BangDiemPhu;
import QuanliCLB.model.HocKi;
import QuanliCLB.model.NienKhoa;
import QuanliCLB.model.TuanHoc;


@WebServlet("/ScoreStudentServlet")
public class ScoreStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		YearDao yearDao = new YearDao();
		WeekDao weekDao = new WeekDao();
		SemesterDao semesterDao = new SemesterDao();
		List<NienKhoa> listNienKhoas = yearDao.getListNienKhoa();
		request.setAttribute("listNienKhoa", listNienKhoas);
		List<HocKi> listHocKis = semesterDao.getHocKi();
		request.setAttribute("listHocKi", listHocKis);
	
		RequestDispatcher rd = request.getRequestDispatcher("Score.jsp");
		rd.forward(request, response);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
