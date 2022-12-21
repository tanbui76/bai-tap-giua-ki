package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.CourseDAO;

/**
 * Servlet implementation class UpdateCourseServlet
 */
@WebServlet("/UpdateCourseServlet")
public class UpdateCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idMonHoc = request.getParameter("txtIDMonHocUpdate");
		String tenMonHoc = request.getParameter("txtTenMonHocUpdate");
		System.out.println(idMonHoc);
		System.out.println(tenMonHoc);
		CourseDAO courseDAO = new CourseDAO();
		
		if (courseDAO.UpdateMonHoc(idMonHoc, tenMonHoc) == 1) {
			response.sendRedirect("CourseListServlet?msg=successUpdate()");
		}
		else {
			response.sendRedirect("CourseListServlet?msg=failUpdate()");
		}
	}

}
