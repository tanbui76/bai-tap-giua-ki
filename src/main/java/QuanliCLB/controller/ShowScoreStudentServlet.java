package QuanliCLB.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import QuanliCLB.dao.ScoreStudentDAO;
import QuanliCLB.model.BangDiem;
import QuanliCLB.model.BangDiemChiTiet;
import QuanliCLB.model.HocKi;
import QuanliCLB.model.MonHoc;
import QuanliCLB.model.NienKhoa;

/**
 * Servlet implementation class ShowScoreStudentServlet
 */
@WebServlet("/ShowScoreStudentServlet")
public class ShowScoreStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ShowScoreStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idNienKhoa = request.getParameter("idNienKhoa");
		
		String idHocKy = request.getParameter("idHocKi");
		/*
		 * PrintWriter out = response.getWriter(); out.print(idHocKy);
		 * out.print(idNienKhoa);
		 */
		ScoreStudentDAO scoreStudentDAO = new ScoreStudentDAO();
		System.out.println(idHocKy);
		HttpSession session = request.getSession();
		String idSinhVien =(String) session.getAttribute("idSinhVien");
		//System.out.println(idSinhVien);		
    	BangDiem bangDiem = scoreStudentDAO.getIdBangDiem(idHocKy,idSinhVien);
    	String idbangDiem = bangDiem.getIdBangDiem();
    	System.out.println(idbangDiem);
    	List<BangDiemChiTiet> bangDiemChiTiets = scoreStudentDAO.getIdMonHoc(idbangDiem);
    	request.setAttribute("listBangDiemChiTiet", bangDiemChiTiets);
    	for (BangDiemChiTiet bangDiemChiTiet : bangDiemChiTiets) {
			String idMon = bangDiemChiTiet.getIdMonHoc();
			MonHoc monHoc = scoreStudentDAO.getTenMon(idMon);
			String tenMonHoc = monHoc.getTenMonhoc();
			System.out.println(monHoc.getTenMonhoc());
			//request.setAttribute("listBangDiemChiTiet", tenMonHoc);
			
			
		}
	
		
		RequestDispatcher rd = request.getRequestDispatcher("Score.jsp");
		rd.forward(request, response);
	}

}
