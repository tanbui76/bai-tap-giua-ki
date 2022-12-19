
package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.StudentListDAO;
import QuanliCLB.dao.TeacherListDAO;

@WebServlet("/DeleteTeacherServlet")
public class DeleteTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idGiaoVien = request.getParameter("txtIDGiaoVienDelete");
		System.out.println(idGiaoVien);
		
		TeacherListDAO tDao = new TeacherListDAO();

		if(tDao.DeleteTeacher(idGiaoVien)==1) {
			response.sendRedirect("TeacherListServlet?msg=successDelete()");
		}
		else {
			response.sendRedirect("TeacherListServlet?msg=failDelete()");
		}
	}

}
