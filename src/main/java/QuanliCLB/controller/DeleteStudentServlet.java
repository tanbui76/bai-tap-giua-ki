package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.StudentListDAO;


@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idSinhvien = request.getParameter("txtIDSinhVienDelete");
		System.out.println(idSinhvien);
		
		StudentListDAO dao = new StudentListDAO();

		if(dao.DeleteStudent(idSinhvien)==1) {
			response.sendRedirect("StudentListServlet?msg=successDelete()");
		}
		else {
			response.sendRedirect("StudentListServlet?msg=failDelete()");
		}
	}

}
