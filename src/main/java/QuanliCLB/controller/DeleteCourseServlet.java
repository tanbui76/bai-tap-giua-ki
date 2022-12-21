package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.CourseDAO;


@WebServlet("/DeleteCourseServlet")
public class DeleteCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idMonHoc = request.getParameter("txtIDMonHocDelete");
		
		CourseDAO courseDAO = new CourseDAO();
		if (courseDAO.DeleteMonHoc(idMonHoc)==1) {
			response.sendRedirect("CourseListServlet?msg=successDelete()");
		}
		else {
			response.sendRedirect("CourseListServlet?msg=failDelete()");
		}
	    
	}

}
