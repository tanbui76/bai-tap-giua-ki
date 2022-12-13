package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.StudentListDAO;


@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idSinhvien = request.getParameter("txtIDSinhVienUpdate");
		String tenSinhvien = request.getParameter("txtTenSinhVienUpdate");
		String emailSinhvien = request.getParameter("txtEmailSinhVienUpdate");
		String diachiSinhvien = request.getParameter("txtDiaChiSinhVienUpdate");
		String maTaiKhoan = request.getParameter("txtMaTaiKhoanUpdate");

		StudentListDAO dao = new StudentListDAO();

		if(dao.UpdateStudent(idSinhvien, tenSinhvien, tenSinhvien, emailSinhvien, emailSinhvien, diachiSinhvien, maTaiKhoan)==1) {
			response.sendRedirect("StudentList.jsp?msg=success");
		}
		else {
			response.sendRedirect("StudentList.jsp?msg=fail");
		}

	}

}
