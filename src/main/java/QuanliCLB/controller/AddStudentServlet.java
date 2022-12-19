package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.StudentListDAO;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		 String idSinhVien = request.getParameter("txtIDSinhVien");
		 String hoTenSinhVien =request.getParameter("txtTenSinhVien");
		 String anhDaiDienSinhVien ="";
		 String email= request.getParameter("txtEmail");
		 String github="";
		 String diaChiSinhVien=request.getParameter("txtDiachi");
		 String idTaiKhoan=request.getParameter("txtMaTaiKhoan");
		 
		 StudentListDAO studentListDAO = new StudentListDAO();
		 
		 if(studentListDAO.InsertStudent(idSinhVien, hoTenSinhVien, anhDaiDienSinhVien, email, github, diaChiSinhVien, idTaiKhoan) == 1) {
			 response.sendRedirect("StudentListServlet?msg=AddSucc()");
		 }else {
			 response.sendRedirect("StudentListServlet?msg=AddErr()");
		 }
		 
		 
		 
	}

}
