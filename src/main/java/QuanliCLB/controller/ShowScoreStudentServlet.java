package QuanliCLB.controller;

import java.io.IOException;
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
import QuanliCLB.model.MonHoc;

/**
 * Servlet implementation class ShowScoreStudentServlet
 */
@WebServlet("/ShowScoreStudentServlet")
public class ShowScoreStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowScoreStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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
			System.out.println(bangDiemChiTiet.getIdMonHoc());
			MonHoc monHoc = scoreStudentDAO.getTenMon(idMon);
			String tenMonHoc = monHoc.getTenMonhoc();
			System.out.println(monHoc.getTenMonhoc());
			String idbangDiemChiTiet =bangDiemChiTiet.getIdBangDiemChiTiet();
			System.out.println(idbangDiemChiTiet);
			String idBangDiem = bangDiem.getIdBangDiem();
			System.out.println(idBangDiem);
			BangDiemChiTiet bangDiemChiTiet2 = scoreStudentDAO.getIdChiTietDiem(idbangDiem, idMon);
			float diemHe1=	bangDiemChiTiet2.getDiemHe1();
     		float diemHe2=	bangDiemChiTiet2.getDiemHe2();
			float diemHe3=	bangDiemChiTiet2.getDiemHe3();
			System.out.println(diemHe1);
		    System.out.println(diemHe2);
			System.out.println(diemHe3);
			float diemhe10 = (float) (diemHe1*0.2 + diemHe2*0.3 + diemHe3*0.5);
			System.out.println(diemhe10);
			request.setAttribute("diemhe10", diemhe10);

			
			;
			
			
		}
	
		RequestDispatcher rd = request.getRequestDispatcher("Score.jsp");
		rd.forward(request, response);
	}

}
