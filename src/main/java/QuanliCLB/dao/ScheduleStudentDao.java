package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.BangDiem;
import QuanliCLB.model.GiaoVien;
import QuanliCLB.model.HocKi;
import QuanliCLB.model.MonHoc;
import QuanliCLB.model.NienKhoa;
import QuanliCLB.model.PhanCongGiangDay;
import QuanliCLB.model.TaiKhoan;
import QuanliCLB.model.TuanHoc;

public class ScheduleStudentDao {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement stm = null;

	public List<PhanCongGiangDay> getListPhanCong(String tuanTuNgay, String tuanDenNgay) {
		List<PhanCongGiangDay> listPhanCong = new ArrayList<>();
		String query = "select * from PhanCongGiangDay where ngayGiangDay BETWEEN ? and ? ";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);
			stm.setString(1, tuanTuNgay);
			stm.setString(2, tuanDenNgay);
			rs = stm.executeQuery();
			while (rs.next()) {
				String idPhanCongGiangDay = rs.getString("idPhanCongGiangDay");
				String idGiaoVien = rs.getString("idGiaoVien");
				String idLop = rs.getString("idLop");
				String idMonHoc = rs.getString("idMonHoc");
				Date ngayGiangDay = rs.getDate("ngayGiangDay");
				String soTietDay = rs.getString("soTietDay");
				PhanCongGiangDay phanCongGiangDay = new PhanCongGiangDay(idPhanCongGiangDay, idGiaoVien, idLop,
						idMonHoc, ngayGiangDay, soTietDay);
				listPhanCong.add(phanCongGiangDay);

			}

		} catch (Exception e) {
			e.printStackTrace();

			// TODO: handle exception
		}
		return listPhanCong;
	}

	public TuanHoc getTuanHoc(String idTuanHoc) {
		TuanHoc tuanHoc = null;
		String query = "select *from TuanHoc where tuanId=?";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);
			stm.setString(1, idTuanHoc);
			rs = stm.executeQuery();
			if (rs.next()) {
				String idTuan = rs.getString("tuanId");
				String tuanName = rs.getString("tuanName");
				String idHocKi = rs.getString("idHocKi");
				Date tuanTuNgay = rs.getDate("tuanTuNgay");
				Date tuanDenNgay = rs.getDate("tuanDenNgay");
				tuanHoc = new TuanHoc(idTuan, tuanName, idHocKi, tuanTuNgay, tuanDenNgay);
				return tuanHoc;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tuanHoc;
	}

	public MonHoc getMonHoc(String idMonHoc) {
		MonHoc monhoc = null;
		String query = "select *from MonHoc where idMonHoc=?";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);
			stm.setString(1, idMonHoc);
			rs = stm.executeQuery();
			if (rs.next()) {
				String idMon = rs.getString("idMonHoc");
				String tenMonHoc = rs.getString("tenMonhoc");
				int tongSoTiet = rs.getInt("tongSoTiet");
				monhoc = new MonHoc(idMon, tenMonHoc, tongSoTiet);
				return monhoc;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return monhoc;
	}

	public String getThuNgay(Date date) {
		
		try {
//			Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(date);  
			DateFormat f = new SimpleDateFormat("EEEE");
			return f.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public String getTenGiaoVien(String idGiaoVien) {
		GiaoVien gVien = new GiaoVien();
		String query = "select *from GiaoVien where idGiaoVien=?";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);
			stm.setString(1, idGiaoVien);
			rs = stm.executeQuery();
			if (rs.next()) {
				gVien.setHoTenGiaoVien(rs.getNString("hoTenGiaoVien"));
				return gVien.getHoTenGiaoVien();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws ParseException {
		String idTuanHoc = "2022TH001";
		ScheduleStudentDao scheduleStudentDao = new ScheduleStudentDao();
//		TuanHoc th = scheduleStudentDao.getTuanHoc(idTuanHoc);
//		String tuanTuNgay = th.getTuanTuNgay();
//		String tuanDenNgay = th.getTuanDenNgay();
//		List<PhanCongGiangDay> list = scheduleStudentDao.getListPhanCong(tuanTuNgay, tuanDenNgay);
//		for (PhanCongGiangDay phanCongGiangDay : list) {
//			System.out.println(phanCongGiangDay.getSoTietDay());
//			System.out.println(phanCongGiangDay.getIdGiaoVien());
//			System.out.println(phanCongGiangDay.getIdMonHoc());
//			String idMon = phanCongGiangDay.getIdMonHoc();
//			MonHoc monHoc = scheduleStudentDao.getMonHoc(idMon);
//			System.out.println(monHoc.getTenMonhoc());
//
//		}
//		System.out.println(scheduleStudentDao.getThuNgay("2022/12/13"));

	}

}
