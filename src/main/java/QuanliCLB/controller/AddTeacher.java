package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.TeacherListDAO;

@WebServlet("/AddTeacher")
public class AddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idGV = request.getParameter("txtIDGiaoVien");
		String nameString = request.getParameter("txtTenGiaoVien");
		String emaiString = request.getParameter("txtEmail");
		String diachi = request.getParameter("txtDiaChi");
		String maTK = request.getParameter("txtMaTaiKhoan");
		
		TeacherListDAO tDao = new TeacherListDAO();
		
	}

}
