package QuanliCLB.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.StudentListDAO;
import QuanliCLB.dao.TeacherListDAO;


@WebServlet("/UpdateTeacherServlet")
public class UpdateTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idGiaovien = request.getParameter("txtIDGiaoVienUpdate");
		String tenGiaoVien = request.getParameter("txtTenGiaoVienUpdate");
		String emailGiaovien = request.getParameter("txtEmailGiaoVienUpdate");
		String diachiGiaovien = request.getParameter("txtDiaChiGiaoVienUpdate");
		String maTaiKhoan = request.getParameter("txtMaTaiKhoanUpdate");

		TeacherListDAO tDao = new TeacherListDAO();

		if(tDao.UpdateTeacher(idGiaovien, tenGiaoVien, "", emailGiaovien, "", diachiGiaovien, maTaiKhoan)==1) {
			response.sendRedirect("TeacherListServlet?msg=successUpdate()");
		}
		else {
			response.sendRedirect("TeacherListServlet?msg=failUpdate()");
		}

	}
}


