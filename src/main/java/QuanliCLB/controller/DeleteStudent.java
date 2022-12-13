package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.StudentListDAO;

@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idSinhvien = request.getParameter("txtIDSinhVienDelete");

		StudentListDAO dao = new StudentListDAO();

		if(dao.DeleteStudent(idSinhvien)==1) {
			response.sendRedirect("StudentList.jsp?msg=success");
		}
		else {
			response.sendRedirect("StudentList.jsp?msg=fail");
		}

	}

}
