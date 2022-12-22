package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.CourseDAO;

@WebServlet("/AddCourseServlet")
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

 


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idMonHoc = request.getParameter("txtIDMonHoc");
		String tenMonHoc = request.getParameter("txtTenMonHoc");
//		String tongSoTiet = request.getParameter("txtTongSoTiet");
		
		CourseDAO dao = new CourseDAO();
		if (dao.InsertMonHoc(idMonHoc, tenMonHoc, 0)==1) {
			response.sendRedirect("CourseListServlet?msg=AddSucc()");
		 }else {
			 response.sendRedirect("CourseListServlet?msg=AddErr()");

		}
	}

}
