package QuanliCLB.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.SemesterDao;
import QuanliCLB.dao.WeekDao;
import QuanliCLB.dao.YearDao;
import QuanliCLB.model.HocKi;
import QuanliCLB.model.NienKhoa;
import QuanliCLB.model.TuanHoc;

/**
 * Servlet implementation class YearServlet
 */
@WebServlet("/YearServlet")
public class YearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YearServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 YearDao yearDao = new YearDao();
		  SemesterDao semesterDao = new SemesterDao();
		  WeekDao weekDao = new WeekDao();
		  List<NienKhoa> nienKhoa = yearDao.getListNienKhoa();
		  int listlenght = 0;
		  request.setAttribute("listNienKhoa", nienKhoa);
		  List<HocKi> hocKi = semesterDao.getHocKi();
		  request.setAttribute("listHocKi", hocKi);
		  List<TuanHoc> tuanHoc = weekDao.getTuanHoc();
		  request.setAttribute("listTuanHoc", tuanHoc);
		  request.setAttribute("listlenght", listlenght);
		  
	 		 
		  RequestDispatcher rDispatcher = request.getRequestDispatcher("Schedule.jsp");
		 rDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
