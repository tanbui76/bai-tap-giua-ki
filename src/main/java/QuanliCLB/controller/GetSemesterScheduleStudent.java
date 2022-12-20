package QuanliCLB.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.ScheduleStudentDao;


@WebServlet("/GetSemesterScheduleStudent")
public class GetSemesterScheduleStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	   String idNienKhoa = request.getParameter("cbbNamHoc");
//	   ScheduleStudentDao scheduleStudentDao = new ScheduleStudentDao();
//	   scheduleStudentDao.getNienKhoa(idNienKhoa);
//	   RequestDispatcher rDispatcher = request.getRequestDispatcher("LoadDataScheduleStudentServlet");
//		rDispatcher.forward(request, response);
	   
	}

}
