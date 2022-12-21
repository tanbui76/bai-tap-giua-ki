package QuanliCLB.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.ScheduleStudentDao;

/**
 * Servlet implementation class GetScheduleStudentServlet
 */
@WebServlet("/GetScheduleStudentServlet")
public class GetScheduleStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetScheduleStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	          
	         String idTuan = request.getParameter("cbbTuan") ;
	         ScheduleStudentDao scheduleStudentDao = new ScheduleStudentDao();
	         scheduleStudentDao.getTuanHoc(idTuan);
	         RequestDispatcher rDispatcher = request.getRequestDispatcher("Schedule.jsp");
			 rDispatcher.forward(request, response);
	         
	           
	           
	           
	}

}
