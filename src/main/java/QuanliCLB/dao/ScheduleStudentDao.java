package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.BangDiem;
import QuanliCLB.model.HocKi;
import QuanliCLB.model.NienKhoa;
import QuanliCLB.model.PhanCongGiangDay;


public class ScheduleStudentDao {
	Connection conn = null;
	 ResultSet rs = null;
	 PreparedStatement stm = null;
	 
	 public List<PhanCongGiangDay> getListPhanCong(){
		 List<PhanCongGiangDay> listPhanCong = new ArrayList<>();
			String query ="select *from PhanCongGiangDay";
			try {
				conn = dbConnection.getConnection();
				stm = conn.prepareStatement(query);		
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
	 
	 
	 public List<BangDiem> getListBangDiem(){
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
	 
	 public void getNienKhoa(String idNienKhoa){	
			String query ="select *from HocKi where idNienKhoa=?";
			try {
				conn = dbConnection.getConnection();
				stm = conn.prepareStatement(query);		
			
				while (rs.next()) {
					stm.setString(1, idNienKhoa);
					stm.executeUpdate();					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
				
				// TODO: handle exception
			}
			
			
	 }
	 
	 public static void main(String[] args) {
		ScheduleStudentDao scheduleStudentDao = new ScheduleStudentDao();
		List<BangDiem> list = scheduleStudentDao.getListBangDiem();
		for (BangDiem bangDiem : list) {
			System.out.println(bangDiem.getIdBangDiem());
			System.out.println(bangDiem.getIdHocKi());
			System.out.println(bangDiem.getIdSinhVien());
			System.out.println(bangDiem.getIdGiaoVien());
			
		}
//			List<PhanCongGiangDay> list = scheduleStudentDao.getListPhanCong();
//			for (PhanCongGiangDay phanCongGiangDay : list) {
//				System.out.println(phanCongGiangDay.getIdGiaoVien());
//				System.out.println(phanCongGiangDay.getSoTietDay());
//				System.out.println(phanCongGiangDay.getNgayGiangDay());
//				
//			}
		}

}
