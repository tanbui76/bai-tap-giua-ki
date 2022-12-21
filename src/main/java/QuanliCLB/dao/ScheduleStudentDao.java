package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.BangDiem;
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
	 
	 public List<PhanCongGiangDay> getListPhanCong(String tuanTuNgay, String tuanDenNgay){
		 List<PhanCongGiangDay> listPhanCong = new ArrayList<>();
			String query ="select * from PhanCongGiangDay where ngayGiangDay BETWEEN ? and ? ";
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
					Date  ngayGiangDay = rs.getDate("ngayGiangDay");
					String soTietDay = rs.getString("soTietDay");
					PhanCongGiangDay phanCongGiangDay = new PhanCongGiangDay(idPhanCongGiangDay,idGiaoVien,idLop,idMonHoc,ngayGiangDay,soTietDay);
					listPhanCong.add(phanCongGiangDay);
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
				
				// TODO: handle exception
			}
			return listPhanCong;
	 }
	 
	 
	 
	/* public List<BangDiem> getListBangDiem(){
		 List<BangDiem> listBangDiem = new ArrayList<>();
			String query ="select *from BangDiem";
			try {
				conn = dbConnection.getConnection();
				stm = conn.prepareStatement(query);		
				rs = stm.executeQuery();
				while (rs.next()) {
					String idBangDiem = rs.getString("idBangDiem");
					String idHocKi = rs.getString("idHocKi");
					String idSinhVien = rs.getString("idSinhVien");
					String idGiaoVien = rs.getString("idGiaoVien");
					BangDiem bangDiem = new BangDiem(idBangDiem,idHocKi,idSinhVien,idGiaoVien);
					listBangDiem.add(bangDiem);
									
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
				
				// TODO: handle exception
			}
			return listBangDiem;
	 }
	 */
	 
	 public TuanHoc getTuanHoc(String idTuanHoc) {
		 TuanHoc tuanHoc = null;
		 String query ="select *from TuanHoc where tuanId=?";
		 try {
				conn = dbConnection.getConnection();
				stm = conn.prepareStatement(query);
				stm.setString(1, idTuanHoc);
				rs = stm.executeQuery();
				if(rs.next()) {
					 String idTuan =rs.getString("tuanId");
					 String tuanName = rs.getString("tuanName");
					 String idNienKhoa = rs.getString("idNienKhoa");
					 String tuanTuNgay = rs.getString("tuanTuNgay");
					 String tuanDenNgay = rs.getString("tuanDenNgay");
					  tuanHoc = new TuanHoc(idTuan,tuanName,idNienKhoa,tuanTuNgay, tuanDenNgay);
					  return tuanHoc;
 
					 
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		 return tuanHoc;
	 }
	 
	 public MonHoc getMonHoc(String idMonHoc) {
		 MonHoc monhoc = null;
		 String query ="select *from MonHoc where idMonHoc=?";
		 try {
				conn = dbConnection.getConnection();
				stm = conn.prepareStatement(query);
				stm.setString(1, idMonHoc);
				rs = stm.executeQuery();
				if(rs.next()) {
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
	
	 public static void main(String[] args) throws ParseException {
		String idTuanHoc ="2022TH001";
		 ScheduleStudentDao scheduleStudentDao = new ScheduleStudentDao();
		 TuanHoc th = scheduleStudentDao.getTuanHoc(idTuanHoc); 
		 String tuanTuNgay =th.getTuanTuNgay();
		 String tuanDenNgay = th.getTuanDenNgay(); 
		 List<PhanCongGiangDay> list = scheduleStudentDao.getListPhanCong(tuanTuNgay, tuanDenNgay);
		 for (PhanCongGiangDay phanCongGiangDay : list) {
			 System.out.println(phanCongGiangDay.getSoTietDay());
			 System.out.println(phanCongGiangDay.getIdGiaoVien());
			 System.out.println(phanCongGiangDay.getIdMonHoc());
			 String idMon =phanCongGiangDay.getIdMonHoc();
			 MonHoc monHoc = scheduleStudentDao.getMonHoc(idMon);
			 System.out.println(monHoc.getTenMonhoc());
			 
			 
			 
			
		}
		 

		
	}

}
