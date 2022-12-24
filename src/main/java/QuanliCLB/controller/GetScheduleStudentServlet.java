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

import QuanliCLB.dao.ScheduleStudentDao;
import QuanliCLB.model.MonHoc;
import QuanliCLB.model.PhanCongGiangDay;
import QuanliCLB.model.TuanHoc;

@WebServlet("/GetScheduleStudentServlet")
public class GetScheduleStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String idTuanHoc = request.getParameter("cbbTuan");
		ScheduleStudentDao scheduleStudentDao = new ScheduleStudentDao();
		TuanHoc th = scheduleStudentDao.getTuanHoc(idTuanHoc);
		String tuanTuNgay = th.getTuanTuNgay().toString();
		String tuanDenNgay = th.getTuanDenNgay().toString();
		List<PhanCongGiangDay> list = scheduleStudentDao.getListPhanCong(tuanTuNgay, tuanDenNgay);
		for (PhanCongGiangDay phanCongGiangDay : list) {
			System.out.println(phanCongGiangDay.getSoTietDay());
			System.out.println(phanCongGiangDay.getIdGiaoVien());
			System.out.println(phanCongGiangDay.getIdMonHoc());
			String idMon = phanCongGiangDay.getIdMonHoc();
			MonHoc monHoc = scheduleStudentDao.getMonHoc(idMon);
			System.out.println(monHoc.getTenMonhoc());
			
		}
		session.setAttribute("list", list);
		session.setAttribute("listlenght", list.size());
		RequestDispatcher rDispatcher = request.getRequestDispatcher("Schedule.jsp?getdata=loadTKB()");
		rDispatcher.forward(request, response);

	}

}
